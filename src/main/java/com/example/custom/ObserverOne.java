package com.example.custom;

import org.springframework.stereotype.Component;

/**
 * 观察者1
 * @author: sunshaoping
 * @date: Create by in 15:42 2018-11-13
 */
@Component
public class ObserverOne implements Observer {

    @Override
    public void update(String content) {
        System.out.println("我是观察者1，得到了通知：" + content);
    }
}
