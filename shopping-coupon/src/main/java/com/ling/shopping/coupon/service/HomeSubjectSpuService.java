package com.ling.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

