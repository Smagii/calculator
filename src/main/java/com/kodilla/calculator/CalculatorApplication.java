package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public void someMethod(){
        System.out.println("It works!");
    }

    public static void main(String[] args) {

        CalculatorApplication calculator =new CalculatorApplication();
        calculator.someMethod();

    }

}
