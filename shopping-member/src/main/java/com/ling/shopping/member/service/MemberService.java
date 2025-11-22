package com.ling.shopping.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.shopping.common.utils.PageUtils;
import com.ling.shopping.member.entity.MemberEntity;
import com.ling.shopping.member.vo.MemberLoginVo;
import com.ling.shopping.member.vo.MemberRegisterVo;
import com.ling.shopping.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:01:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(MemberRegisterVo registerVo);

    MemberEntity login(MemberLoginVo loginVo);

    MemberEntity login(SocialUser socialUser);
}

