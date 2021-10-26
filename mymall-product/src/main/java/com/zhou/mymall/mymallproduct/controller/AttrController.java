package com.zhou.mymall.mymallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.zhou.mymall.mymallproduct.entity.ProductAttrValueEntity;
import com.zhou.mymall.mymallproduct.service.ProductAttrValueService;
import com.zhou.mymall.mymallproduct.vo.AttrRespVo;
import com.zhou.mymall.mymallproduct.vo.AttrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zhou.mymall.mymallproduct.entity.AttrEntity;
import com.zhou.mymall.mymallproduct.service.AttrService;
import com.zhou.common.utils.PageUtils;
import com.zhou.common.utils.R;



/**
 * 商品属性
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
@RestController
@RequestMapping("mymallproduct/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @Autowired
    private ProductAttrValueService productAttrValueService;
    @GetMapping("/base/listforspu/{spuId}")
    public R baseAttrListforSpu(@PathVariable("spuId") Long spuId) {
        List<ProductAttrValueEntity> entities = productAttrValueService.baseAttrListforSpu(spuId);
        return R.ok().put("data", entities);
    }

    @RequestMapping("/{attrType}/list/{catelogId}")
    //@RequiresPermissions("product:attr:list")
    public R BaseList(@RequestParam Map<String, Object> params, @PathVariable("catelogId") Long catelogId,
                      @PathVariable("attrType") String type) {
        PageUtils page = attrService.queryBaseAttrPage(params, catelogId, type);
        return R.ok().put("page", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("mymallproduct:attr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    //@RequiresPermissions("product:attr:info")
    public R info(@PathVariable("attrId") Long attrId) {
        AttrRespVo respVo = attrService.getAttrInfo(attrId);
        return R.ok().put("attr", respVo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:attr:save")
    public R save(@RequestBody AttrVo attr) {
        attrService.saveAttr(attr);

        return R.ok();
    }

    /**
     * 修改
     */

    @RequestMapping("/update")
    //@RequiresPermissions("product:attr:update")
    public R update(@RequestBody AttrVo attr) {
        attrService.updateAttr(attr);
        return R.ok();
    }

    @PostMapping("/update/{spuId}")
    //@RequiresPermissions("product:attr:update")
    public R updateSpuAttr(@PathVariable Long spuId, @RequestBody List<ProductAttrValueEntity> entities) {
        productAttrValueService.updateSpuAttr(spuId, entities);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("mymallproduct:attr:delete")
    public R delete(@RequestBody Long[] attrIds){
		attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
