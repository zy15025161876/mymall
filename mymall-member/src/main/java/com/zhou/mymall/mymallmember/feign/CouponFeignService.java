package com.zhou.mymall.mymallmember.feign;

import com.zhou.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mymall-coupon")
public interface CouponFeignService {
    @RequestMapping("mymallcoupon/coupon/member/list")
    public R membercoupons();
}
