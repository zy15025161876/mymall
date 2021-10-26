package com.zhou.mymall.mymallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mymall.mymallproduct.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params, Long catlogId);

    PageUtils queryPage(Map<String, Object> params);
}

