package com.example.demo.service;

import com.example.demo.exceptions.ExceptionsDivide;
import com.example.demo.servise.CalculatorServise;
import com.example.demo.servise.CalculatorServiseInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorServiceTest {
    CalculatorServiseInterface calculator = new CalculatorServise();

    @Test
    public void shouldReturnStringWelcome(){
        String result = calculator.welcome();
        assertEquals("<h1> Добро пожаловать в калькулятор </h1>", result);
    }

    @ParameterizedTest
    @CsvSource({"5,5,10", "2,7,9", "3,2,5"})
    public void shouldReturn10When5Plus5(String num1, String num2, int expected){
        int result = calculator.resultPlus(num1, num2);
        assertEquals(expected, result);

    }

    @ParameterizedTest
    @CsvSource({"5,5,0", "9,3,6", "7,2,5"})
    public void shouldReturn10When5Minus5(String num1, String num2, int expected){
        int result = calculator.resultMinus(num1, num2);
        assertEquals(expected, result);

    }

    @Test
    public void shouldReturn10When5Multiply5(){
        int result = calculator.resultMultiply("5","5");
        assertEquals(25, result);

    }

    @Test
    public void shouldReturn10When5Divide5(){
        int result = calculator.resultDivide("5","5");
        assertEquals(1, result);

    }

    @Test
    public void shouldReturnExceptionWhenDivideBy0(){
        assertThrows(ExceptionsDivide.class, ()->calculator.resultDivide("5", "0"));
    }
}
