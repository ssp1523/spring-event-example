package com.example.java;

import java.util.Observable;

/**
 * 实现java 可观察对象(主题)
 * @author: sunshaoping
 * @date: Create by in 17:03 2018-11-13
 */
public class MyObservable extends Observable {

    public MyObservable() {
        setChanged();
    }
}
