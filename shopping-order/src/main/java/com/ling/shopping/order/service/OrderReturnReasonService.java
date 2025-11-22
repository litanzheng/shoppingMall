package com.ling.shopping.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:07:28
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

