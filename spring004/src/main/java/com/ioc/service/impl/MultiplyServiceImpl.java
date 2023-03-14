package com.ioc.service.impl;

import com.ioc.service.CaService;

public class MultiplyServiceImpl implements CaService {
    @Override
    public double methods(double number1, double number2) {
        System.out.println("执行*");
        return number1*number2;
    }
}
