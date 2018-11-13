package com.example.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 观察的主题，主题发生变化通知所用观察者
 * @author: sunshaoping
 * @date: Create by in 15:29 2018-11-13
 */
@Component
public class Subject {

    private final List<Observer> observerList;

    /**
     * Spring 容器中所有实现Observer接口的实例
     * @param observerList 所有实现Observer接口的实例
     */
    @Autowired
    public Subject(List<Observer> observerList) {
        this.observerList = observerList;
    }


    /**
     * 通知观察者
     * @param content 通知内容
     */
    public void notify(String content) {
        //通知全部观察者
        for (Observer observer : observerList) {
            observer.update(content);
        }
    }
}
