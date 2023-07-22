package com.example.demo.controller;

import com.example.demo.servise.CalculatorServise;
import com.example.demo.servise.CalculatorServiseInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorServise calculatorServise;

    public CalculatorController(CalculatorServise calculatorServise) {
        this.calculatorServise = calculatorServise;
    }

    @GetMapping
    public String welcome() {
        return calculatorServise.welcome();
    }

    @GetMapping(path = "/plus")
    public String resultPlus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "+" + num2 + "=" + calculatorServise.resultPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String resultMinus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "+" + num2 + "=" + calculatorServise.resultMinus(num1, num2);
    }

    @GetMapping(path = "/multuply")
    public String resultMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "*" + num2 + "=" + calculatorServise.resultMultiply(num1, num2);
    }

    @GetMapping(path = "/divade")
    public String resultDivade(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "*" + num2 + "=" + calculatorServise.resultDivide(num1, num2);
    }

}
