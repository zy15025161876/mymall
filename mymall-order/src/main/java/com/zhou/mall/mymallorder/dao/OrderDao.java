package com.zhou.mall.mymallorder.dao;

import com.zhou.mall.mymallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 00:40:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
