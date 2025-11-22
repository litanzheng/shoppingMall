package com.ling.shopping.auto.feign;

import com.ling.shopping.common.utils.R;
import com.ling.shopping.auto.feign.fallback.MemberFallbackService;
import com.ling.shopping.auto.vo.SocialUser;
import com.ling.shopping.auto.vo.UserLoginVo;
import com.ling.shopping.auto.vo.UserRegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "shopping-member",fallback = MemberFallbackService.class)
public interface MemberFeignService {

    @RequestMapping("member/member/register")
    R register(@RequestBody UserRegisterVo registerVo);


    @RequestMapping("member/member/login")
     R login(@RequestBody UserLoginVo loginVo);

    @RequestMapping("member/member/oauth2/login")
    R login(@RequestBody SocialUser socialUser);
}
