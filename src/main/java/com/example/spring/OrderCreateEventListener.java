package com.example.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 订单创建事件,基于接口
 * @author: sunshaoping
 * @date: Create by in 18:43 2018-11-13
 */
@Component
public class OrderCreateEventListener implements ApplicationListener<OrderCreateEvent> {


    @Override
    public void onApplicationEvent(OrderCreateEvent event) {
        System.out.printf("ApplicationListener 接口实现，订单号[%s]：,锁定商品[%s]\n",
                event.getOrder().getOrderNo(), event.getOrder().getGoods());
    }
}
