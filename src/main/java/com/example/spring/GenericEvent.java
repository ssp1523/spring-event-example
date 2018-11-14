package com.example.spring;

/**
 * 通用泛型事件
 * @author: sunshaoping
 * @date: Create by in 11:56 2018-11-14
 */
public class GenericEvent<T> {

    private final T data;

    public GenericEvent(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
