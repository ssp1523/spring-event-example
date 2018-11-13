package com.example.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 订单创建事件
 * @author: sunshaoping
 * @date: Create by in 17:56 2018-11-13
 */
public class OrderCreateEvent extends ApplicationEvent {

    private final Order order;

    public OrderCreateEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
