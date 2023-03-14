package com.ioc.service.impl;

import com.ioc.service.CaService;

public class DivisionServiceImpl implements CaService {
    @Override
    public double methods(double number1, double number2) {
        System.out.println("除法÷");
        return number1/number2;
    }
}
