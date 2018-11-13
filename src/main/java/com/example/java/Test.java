package com.example.java;

import java.util.Observable;

/**
 * java 观察者模式测试
 * @author: sunshaoping
 * @date: Create by in 16:55 2018-11-13
 */
public class Test {

    public static void main(String[] args) {
        Observable observable = new MyObservable();
        //添加观察者
        observable.addObserver(new MyObserver());
        //发布消息
        observable.notifyObservers("您的快递到了，请下楼领取 ");


    }
}
