package com.example.demo.servise;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServise implements CalculatorServiseInterface {

    @Override
    public String welcome() {
        return "<h1> Добро пожаловать в калькулятор </h1>";
    }

    @Override
    public String resultPlus(String num1, String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String resultMinus(String num1, String num2) {
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String resultMultiply(String num1, String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String resultDivide(String num1, String num2) {
        if (Integer.parseInt(num2) == 0) {
            return "На ноль делить нельзя";
        }
        int result = Integer.parseInt(num1) / Integer.parseInt(num2);
        return num1 + " / " + num2 + " = " + result;

    }
}
