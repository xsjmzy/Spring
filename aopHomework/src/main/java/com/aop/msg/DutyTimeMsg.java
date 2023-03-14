package com.aop.msg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
//作一个切面通知
@Aspect
public class DutyTimeMsg {
    //切入点
    @Pointcut("execution(* com.aop.service.impl.DutyDaoImpl.sleep())")
    public void sleep(){}

    //1.前置通知
    @Before("sleep()")
    public void sleepTest(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:MM:SS");
        String formattedDateTime= now.format(formatter);
        System.out.println(formattedDateTime+"（这里是前置通知）\n");
    }


    @Pointcut("execution(* com.aop.service.impl.DutyDaoImpl.eating())")
    public void eating(){}
    //后置通知(不管会不会出现异常都通知)
    @After("eating()")
    public void eatingTest(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:MM:SS");
        String formattedDateTime= now.format(formatter);
        System.out.println(formattedDateTime+"（这里是后置通知）\n");
    }

    @Pointcut("execution(* com.aop.service.impl.DutyDaoImpl.sayHello())")
    public void sayHello(){}
    //后置通知(不管会不会出现异常都通知)
    @Around("sayHello()")
    public Object eatingTest(ProceedingJoinPoint point) throws Throwable{
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:MM:SS");
        String formattedDateTime= now.format(formatter);
        System.out.println(formattedDateTime+"（这里是环绕通知）");
        Object p=point.proceed();
        System.out.println("x（这里是环绕通知）\n");
        return p;
    }

    @Pointcut("execution(* com.aop.service.impl.DutyDaoImpl.goShopping())")
    public void goshopping(){}
    //返回通知
    @AfterReturning("goshopping()")
    public void goShoppingTest(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:MM:SS");
        String formattedDateTime= now.format(formatter);
        System.out.println(formattedDateTime+"（这里是返回通知）\n");
    }

    @Pointcut("execution(* com.aop.service.impl.DutyDaoImpl.goShopping())")
    public void speakChinese(){}
    //异常通知
    @AfterThrowing("speakChinese()")
    public void speakChineseTest(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:MM:SS");
        String formattedDateTime= now.format(formatter);
        System.out.println(formattedDateTime+"（这里是异常通知）\n");
    }

}
