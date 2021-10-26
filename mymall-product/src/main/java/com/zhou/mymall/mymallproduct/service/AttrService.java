package com.zhou.mymall.mymallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mymall.mymallproduct.entity.AttrEntity;
import com.zhou.mymall.mymallproduct.vo.AttrRespVo;
import com.zhou.mymall.mymallproduct.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-22 20:30:37
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    void saveAttr(AttrVo attr);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

}

