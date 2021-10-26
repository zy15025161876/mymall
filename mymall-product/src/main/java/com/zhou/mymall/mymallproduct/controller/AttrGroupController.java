package com.zhou.mymall.mymallproduct.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.zhou.mymall.mymallproduct.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhou.mymall.mymallproduct.entity.AttrGroupEntity;
import com.zhou.mymall.mymallproduct.service.AttrGroupService;
import com.zhou.common.utils.PageUtils;
import com.zhou.common.utils.R;



/**
 * 属性分组
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
@RestController
@RequestMapping("mymallproduct/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */

    @RequestMapping("/list/{catlogId}")
    // @RequiresPermissions("mymallproduct:attrgroup:list")
    public R list(@RequestParam Map<String, Object> params,@PathVariable("catlogId") Long catlogId){


       // PageUtils page = attrGroupService.queryPage(params,catlogId);
        PageUtils page = attrGroupService.queryPage(params,catlogId);

        return R.ok().put("page", page);

    }




    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
   // @RequiresPermissions("mymallproduct:attrgroup:info")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){
		AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);
        Long catelogId=attrGroup.getCatelogId();
      Long[] path =  categoryService.findCatelogPath(catelogId);
      attrGroup.setCatelogPath(path);

        return R.ok().put("attrGroup", attrGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("mymallproduct:attrgroup:save")
    public R save(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.save(attrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("mymallproduct:attrgroup:update")
    public R update(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.updateById(attrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("mymallproduct:attrgroup:delete")
    public R delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
