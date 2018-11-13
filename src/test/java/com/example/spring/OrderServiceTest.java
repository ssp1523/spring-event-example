package com.example.spring;

import com.example.SpringEventExampleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 订单测试
 * @author: sunshaoping
 * @date: Create by in 19:16 2018-11-13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringEventExampleApplication.class)
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void save() {
        Order order = new Order();
        order.setGoods("4K液晶电视、冰箱");
        orderService.save(order);
    }
}