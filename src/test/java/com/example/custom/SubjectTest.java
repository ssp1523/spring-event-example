package com.example.custom;

import com.example.SpringEventExampleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: sunshaoping
 * @date: Create by in 15:48 2018-11-13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringEventExampleApplication.class)
public class SubjectTest {

    @Autowired
    Subject subject;

    @Test
    public void notify1() {
        subject.notify("您的支付宝到账100W ");
        subject.notify("您的工资发放 10W ");
    }
}