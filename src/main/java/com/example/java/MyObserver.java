package com.example.java;


import java.util.Observable;
import java.util.Observer;

/**
 * java 观察者实现
 * @author: sunshaoping
 * @date: Create by in 16:53 2018-11-13
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("java 观察者，收到 :" + arg);
    }

}
