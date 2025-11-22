package com.ling.shopping.cart.feign;

import com.ling.shopping.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("shopping-product")
public interface ProductFeignService {
    @RequestMapping("product/skuinfo/info/{skuId}")
     R info(@PathVariable("skuId") Long skuId);

    @RequestMapping("product/skusaleattrvalue/getSkuSaleAttrValuesAsString")
    List<String> getSkuSaleAttrValuesAsString(@RequestBody Long skuId);
}
