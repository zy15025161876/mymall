package com.zhou.mymall.mymallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.utils.PageUtils;
import com.zhou.mymall.mymallmember.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 00:24:25
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

