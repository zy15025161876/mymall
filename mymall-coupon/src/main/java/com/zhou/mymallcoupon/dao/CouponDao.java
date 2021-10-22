package com.zhou.mymallcoupon.dao;

import com.zhou.mymallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 00:03:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
