package com.ling.shopping.search.feign;

import com.ling.shopping.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("shopping-product")
public interface ProductFeignService {
    @RequestMapping("product/attr/info/{attrId}")
    R info(@PathVariable("attrId") Long attrId);
}
