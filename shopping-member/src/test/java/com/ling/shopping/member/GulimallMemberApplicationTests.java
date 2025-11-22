package com.ling.shopping.member;

import com.ling.shopping.member.entity.MemberEntity;
import com.ling.shopping.member.service.MemberService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class shoppingMemberApplicationTests {

    @Autowired
    private MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setEmail("test@gmail.com");
        memberEntity.setUsername("小胜");
        memberService.save(memberEntity);
    }

}
