package com.example.spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * order 监听
 * @author: sunshaoping
 * @date: Create by in 14:08 2018-11-14
 */
@Component
public class OrderListener {

    @EventListener
    public void order(Order order) {
        System.out.println("监听一个订单");
    }

    /**
     * 返回一个事件
     */
    @EventListener
    public OrderCreateEvent orderReturnEvent(Order order) {
        System.out.println("监听一个订单,返回一个新的事件 OrderCreateEvent");
        return new OrderCreateEvent(this, order);
    }

    /**
     * 返回集合事件
     */
    @EventListener
    public Collection<OrderCreateEvent> orderReturnListEvent(Order order) {
        System.out.println("监听一个订单,返回集合的事件 OrderCreateEvent");

        return Collections.singleton(new OrderCreateEvent(this, order));
    }

    /**
     * 返回数组事件
     */
    @EventListener
    public Object[] orderReturnArrayEvent(Order order) {
        System.out.println("监听一个订单,返回数组的事件 OrderCreateEvent");
        return new OrderCreateEvent[]{new OrderCreateEvent(this, order), new OrderCreateEvent(this, order)};
    }


}

