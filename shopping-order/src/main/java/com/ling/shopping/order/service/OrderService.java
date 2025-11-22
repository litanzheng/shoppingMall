package com.ling.shopping.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.to.mq.SeckillOrderTo;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.order.entity.OrderEntity;
import com.ling.shopping.order.vo.*;

import java.util.Map;

/**
 * 订单
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:07:28
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    OrderConfirmVo confirmOrder();

    SubmitOrderResponseVo submitOrder(OrderSubmitVo submitVo);

    OrderEntity getOrderByOrderSn(String orderSn);

    void closeOrder(OrderEntity orderEntity);

    PageUtils getMemberOrderPage(Map<String, Object> params);

    PayVo getOrderPay(String orderSn);

    void handlerPayResult(PayAsyncVo payAsyncVo);

    void createSeckillOrder(SeckillOrderTo orderTo);
}

