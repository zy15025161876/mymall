package com.zhou.mymall.mymallproduct.vo.skuItemvo;


import com.zhou.mymall.mymallproduct.vo.spvsavevo.Attr;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class SpuItemAttrGroupVo {
    private String groupName;
    private List<Attr> attrValues;
}
