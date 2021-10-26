package com.zhou.mymall.mymallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mymall.mymallproduct.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseAttrListforSpu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);

}

