package com.zhou.mymall.mymallproduct.dao;

import com.zhou.mymall.mymallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
