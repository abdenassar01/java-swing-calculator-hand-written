package com.calculatrice.example;

import com.calculatrice.example.graphicalInterface.Calculatrice;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        Calculatrice calculatrice ;
        calculatrice = new Calculatrice();
        calculatrice.setSize(400, 500);
        calculatrice.setVisible(true);
        calculatrice.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
