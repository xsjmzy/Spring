package com.ioc.service.impl;

import com.ioc.service.CaService;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements CaService {
    @Override
    public double methods(double number1, double number2) {
        System.out.println("执行+");
        return number1+number2;
    }
}
