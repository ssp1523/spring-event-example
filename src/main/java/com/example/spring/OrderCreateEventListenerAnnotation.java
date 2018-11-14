package com.example.spring;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 注解驱动监听
 * @author: sunshaoping
 * @date: Create by in 11:20 2018-11-14
 */
@Component
public class OrderCreateEventListenerAnnotation {

    @EventListener(OrderCreateEvent.class)
    public void orderCreateEvent() {
        System.out.println("订单创建事件，@EventListener 注解驱动实现");
    }

    @EventListener
    public void orderCreateEvent(OrderCreateEvent event) {
        System.out.println("订单创建事件，@EventListener 注解驱动实现");
    }

    @EventListener(condition = "#event.order.orderStatus eq '待付款'")
    public void orderCreateEventCondition(OrderCreateEvent event) {
        System.out.println("订单创建事件，@EventListener 注解驱动实现");
    }


    @Async
    @EventListener
    public void orderCreateEventAsync(OrderCreateEvent event) {
        System.out.println("订单创建事件，@EventListener 注解驱动实现");
    }


}
