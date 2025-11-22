package com.ling.shopping.order.feign;

import com.ling.shopping.order.vo.OrderItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@FeignClient("shopping-cart")
public interface CartFeignService {

    @ResponseBody
    @RequestMapping("/getCheckedItems")
    List<OrderItemVo> getCheckedItems();
}
