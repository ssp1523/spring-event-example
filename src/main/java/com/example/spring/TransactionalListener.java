package com.example.spring;

import org.springframework.stereotype.Component;

/**
 * 事物监听
 * @author: sunshaoping
 * @date: Create by in 14:22 2018-11-14
 */
@Component
public class TransactionalListener {
    /**
     * 改示例没有连接数据，这个监听暂时演示不了，有兴趣的童鞋可以连接数据库试下
     */
    //    @TransactionalEventListener(phase = BEFORE_COMMIT)
    public void txEvent(Order order) {
        System.out.println("事物监听");
    }
}
