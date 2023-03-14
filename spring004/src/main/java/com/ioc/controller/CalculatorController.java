package com.ioc.controller;

import com.ioc.service.CaService;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
    private CaService caService;
    public CaService getCaService() {
        return caService;
    }

    public void setCaService(CaService caService) {
        this.caService = caService;
    }
   //有参构造
    public CalculatorController(CaService caService) {
        this.caService = caService;
    }

   //空构造
    public CalculatorController(){}
}
