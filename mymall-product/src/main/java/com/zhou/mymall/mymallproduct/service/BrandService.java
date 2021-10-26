package com.zhou.mymall.mymallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mymall.mymallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

