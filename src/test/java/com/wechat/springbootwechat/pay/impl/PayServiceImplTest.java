package com.wechat.springbootwechat.pay.impl;

import com.wechat.springbootwechat.pay.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Description: java类作用描述
 * @Author: zhangqiang
 * @CreateDate: 2019/1/5 10:46
 * @Version: 1.0
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class PayServiceImplTest {
    @Autowired
    private PayService payService;
    @Test
    public void create(){
        Object ob=-5;
        System.out.println(ob.equals(-5));
        payService.create();
    }

}