package com.ling.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

