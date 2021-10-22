package com.zhou.mymall.mymallmember.dao;

import com.zhou.mymall.mymallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhouyu
 * @email 1938790964@qq.com
 * @date 2021-10-23 00:37:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
