package com.ling.shopping.product.vo;

import com.ling.shopping.product.entity.AttrEntity;
import com.ling.shopping.product.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class AttrGroupWithAttrVo extends AttrGroupEntity {
    private List<AttrEntity> attrs;
}
