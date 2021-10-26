package com.zhou.mymall.mymallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhou.mymall.mymallproduct.entity.CategoryEntity;
import com.zhou.mymall.mymallproduct.service.CategoryService;
import com.zhou.common.utils.PageUtils;
import com.zhou.common.utils.R;



/**
 * 商品三级分类
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
@RestController
    @RequestMapping("mymallproduct/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类及子分类，以树形结构组装
     */
    @RequestMapping("/list/tree")
   // @RequiresPermissions("mymallproduct:category:list")
    public R list(){
      List<CategoryEntity> entities = categoryService.listWithTree();

        return R.ok().put("data",entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
   // @RequiresPermissions("mymallproduct:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("mymallproduct:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }
    //批量修改
    @RequestMapping("/update/sort")
    // @RequiresPermissions("mymallproduct:category:update")
    public R updateSort(@RequestBody CategoryEntity[] category){
        categoryService.updateBatchById(Arrays.asList(category));

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("mymallproduct:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateCascade(category);

        return R.ok();
    }

    /**
     * 删除
     * @RequestBody 获取请求体，只有post请求有
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("mymallproduct:category:delete")
    public R delete(@RequestBody Long[] catIds){
        //1、检查当前的菜单是否被其他地方引用
		categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenusById(Arrays.asList(catIds));
        return R.ok();
    }

}
