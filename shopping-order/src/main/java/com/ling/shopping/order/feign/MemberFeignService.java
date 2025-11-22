package com.ling.shopping.order.feign;

import com.ling.shopping.order.vo.MemberAddressVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("shopping-member")
public interface MemberFeignService {

    @RequestMapping("member/memberreceiveaddress/getAddressByUserId")
    List<MemberAddressVo> getAddressByUserId(@RequestBody Long userId);
}
