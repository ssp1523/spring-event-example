package com.example.spring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 订单Service
 * @author: sunshaoping
 * @date: Create by in 17:57 2018-11-13
 */
@Service
public class OrderService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 订单保存
     */
    public void save(Order order) {
        //生成订单号
        String orderNo = getOrderNo();
        order.setOrderNo(orderNo);
        order.setOrderStatus("待付款");
        order.setCreateTime( LocalDateTime.now());
        System.out.println("订单保存成功：" + order);
        //发布订单创建事件
        applicationEventPublisher.publishEvent(new OrderCreateEvent(this, order));

    }

    private String getOrderNo() {
        String millis = String.valueOf(System.currentTimeMillis());
        String str = millis.substring(millis.length() - 7, millis.length() - 1);
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + str;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

        this.applicationEventPublisher = applicationEventPublisher;
    }
}
