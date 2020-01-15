package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public void someMethod(){
        System.out.println("It works!");
    }

    public int addNumbers(int a,int b){
        return a+b;
    }
    public int subtractNumbers(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {

        CalculatorApplication calculator =new CalculatorApplication();

        System.out.println("Sum is: "+calculator.addNumbers(5,5));
        System.out.println("Subtract is: "+calculator.subtractNumbers(6,4));

    }

}
