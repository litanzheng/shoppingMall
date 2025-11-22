package com.ling.shopping.auto.feign.fallback;

import com.ling.shopping.common.exception.BizCodeEnum;
import com.ling.shopping.common.utils.R;
import com.ling.shopping.auto.feign.MemberFeignService;
import com.ling.shopping.auto.vo.SocialUser;
import com.ling.shopping.auto.vo.UserLoginVo;
import com.ling.shopping.auto.vo.UserRegisterVo;
import org.springframework.stereotype.Service;

@Service
public class MemberFallbackService implements MemberFeignService {
    @Override
    public R register(UserRegisterVo registerVo) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }

    @Override
    public R login(UserLoginVo loginVo) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }

    @Override
    public R login(SocialUser socialUser) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }
}
