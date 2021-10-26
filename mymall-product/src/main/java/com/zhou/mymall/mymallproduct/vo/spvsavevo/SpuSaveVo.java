/**
  * Copyright 2021 bejson.com 
  */
package com.zhou.mymall.mymallproduct.vo.spvsavevo;

import com.zhou.common.valid.AddGroup;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Auto-generated: 2021-01-24 18:17:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SpuSaveVo {

    @NotEmpty(groups = {AddGroup.class})
    private String spuName;
    private String spuDescription;
    @NotEmpty(groups = {AddGroup.class})
    private Long catalogId;
    @NotEmpty(groups = {AddGroup.class})
    private Long brandId;
    private double weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    @NotEmpty(groups = {AddGroup.class})
    private List<BaseAttrs> baseAttrs;
    @NotEmpty(groups = {AddGroup.class})
    private List<Skus> skus;

}