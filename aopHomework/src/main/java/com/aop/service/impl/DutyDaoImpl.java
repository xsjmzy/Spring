package com.aop.service.impl;

import com.aop.service.DutyDao;
import org.springframework.stereotype.Service;

@Service("duty")
public class DutyDaoImpl implements DutyDao {
    @Override
    public void sayHello() {
        System.out.println("欢迎光临!");
    }

    @Override
    public void speakingChinese() {
        System.out.println("请说中文!");
    }

    @Override
    public void goShopping() {
        System.out.println("去购物❥(^_-)");
    }

    @Override
    public void sleep() {
        System.out.println("去睡觉!");
    }

    @Override
    public void eating() {
        System.out.println("去吃饭!");
    }
}
