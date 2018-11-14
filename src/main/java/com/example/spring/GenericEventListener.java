package com.example.spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 监听
 * @author: sunshaoping
 * @date: Create by in 13:57 2018-11-14
 */
@Component
public class GenericEventListener {


    @EventListener
    public void orderListener(GenericEvent<Order> event) {
        System.out.println("通用泛型事件监听，订单");
    }



}
