package com.zhou.mymallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhou.mymallcoupon.entity.CouponEntity;
import com.zhou.mymallcoupon.service.CouponService;
import com.zhou.common.utils.PageUtils;
import com.zhou.common.utils.R;



/**
 * 优惠券信息
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 00:03:19
 */
//@RefreshScope//动态刷新nacos里配置的值
@RestController
@RequestMapping("mymallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;
    //测试
    @RequestMapping("/member/list")
    public R membercoupons(){
       CouponEntity couponEntity = new CouponEntity();
       couponEntity.setCouponName("买一百减十元");
        return R.ok().put("coupons",Arrays.asList(couponEntity));
    }
    //测试
    @Value("${my.name}")
    private  String name;
    @Value("${my.age}")
    private Integer age;
    @RequestMapping("/test1")
    public R test(){
       return R.ok().put("姓名",name).put("年龄",age);


    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("mymallcoupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("mymallcoupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("mymallcoupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("mymallcoupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("mymallcoupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
