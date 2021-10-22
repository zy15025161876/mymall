package com.zhou.mall.mymallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mall.mymallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 01:17:52
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

