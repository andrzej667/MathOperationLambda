package com.sdajava.streams;

public class Main {

    private static int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println("10 + 5 = " + operate(10, 5, addition));


    }
}
