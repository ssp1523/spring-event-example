package com.example.custom;

/**
 * 观察者/监听者
 * @author: sunshaoping
 * @date: Create by in 15:25 2018-11-13
 */
public interface Observer {

    /**
     * 被观察者发布通知时，调用改方法
     * @param content 通知内容，此处使用的是String，它可以是任意对象
     */
    void update(String content);

}
