package com.ling.shopping.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:07:28
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

