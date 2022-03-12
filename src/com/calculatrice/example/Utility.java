package com.calculatrice.example;

public class Utility {
    public static int factorial(int n){
        return (n == 0)? 1 : n * factorial(n -1);
    }
}
