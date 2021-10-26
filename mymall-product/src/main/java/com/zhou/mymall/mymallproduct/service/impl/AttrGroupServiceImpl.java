package com.zhou.mymall.mymallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.common.utils.PageUtils;
import com.zhou.common.utils.Query;

import com.zhou.mymall.mymallproduct.dao.AttrGroupDao;
import com.zhou.mymall.mymallproduct.entity.AttrGroupEntity;
import com.zhou.mymall.mymallproduct.service.AttrGroupService;
import org.springframework.util.StringUtils;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        String key = (String) params.get("key");
        QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>();
        if (!StringUtils.isEmpty(key)) {
            wrapper.and((obj) -> {
                obj.eq("attr_group_id", key).or().like("attr_group_name", key);
            });
        }
        if (catelogId == 0) {
            IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<AttrGroupEntity>());
            return new PageUtils(page);
        } else {
            wrapper.eq("catelog_id", catelogId);
            IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params),
                    wrapper);
            return new PageUtils(page);
        }
//        if(catlogId==0){
//            IPage<AttrGroupEntity> page = this.page(
//                    new Query<AttrGroupEntity>().getPage(params),
//                    new QueryWrapper<AttrGroupEntity>()
//
//            );
//            return new PageUtils(page);
//        }
//        else {
//            String key =(String) params.get("key");
//            //select * from pms_attr_group where catelogId=? and (attr_group_id=key or attr_group_name like%key%)
//            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id",catlogId);
//            if(StringUtils.isEmpty(key)){
//                wrapper.and((obj)->{
//                    obj.eq("attr_group_id",key).or().like("attr_group_name",key);//like等于%n%,likeL左%，likeR右%
//
//                });
//
//            }
//            IPage<AttrGroupEntity> page = this.page(
//                    new Query<AttrGroupEntity>().getPage(params),
//                    wrapper
//
//            );
//            return new PageUtils(page);
//        }

    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}
