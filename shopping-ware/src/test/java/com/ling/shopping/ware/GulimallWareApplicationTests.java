package com.ling.shopping.ware;

import com.ling.shopping.ware.entity.WareInfoEntity;
import com.ling.shopping.ware.service.WareInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class shoppingWareApplicationTests {
    @Autowired
    private WareInfoService wareInfoService;

    @Test
    void contextLoads() {
        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setName("测试信息");
        wareInfoService.save(wareInfoEntity);
    }

}
