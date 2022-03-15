package com.calculatrice.example.arithmitiqueOperation;


import javax.swing.*;

public class Utility {

    private double number1;
    private double number2;
    private char operation = 'n';
    
    
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public  double addTwoNumbers(double nbr1, double nbr2){
        return nbr1 + nbr2;
    }
    
    public  double soubstractTwoNumbers(double nbr1, double nbr2){
        return nbr1 - nbr2;
    }
    
    public  double devideTwoNumbers(double nbr1, double nbr2){
        return nbr1 + nbr2;
    }
    
    public  double multiplyTwoNumbers(double nbr1, double nbr2){
        return nbr1 * nbr2;
    }
    
    public  double remainderOfDivision(double nbr1, double nbr2){
        return nbr1 % nbr2;
    }
    
    public  double sin(String nbr){
        return Math.sin(Double.parseDouble(nbr));
    }
    
    public  double ciel(String nbr){
        return Math.ceil(Double.parseDouble(nbr));
    }
    
    public  double floor(String nbr){
        return Math.floor(Double.parseDouble(nbr));
    }
    
    public  double cos(String nbr){
        return Math.cos(Double.parseDouble(nbr));
    }
    
    public  int abs(String nbr){
        return Math.abs(Integer.parseInt(nbr));
    }
    
    public  double sqrt(String nbr){
        return Math.sqrt(Double.parseDouble(nbr));
    }
    
    public  double power(double nbr1, double nbr2){
        return Math.pow(nbr1, nbr2);
    } 
    
    public  double random(){
        return Math.floor(Math.random() * 10);
    }
    
    public  String toBin(String nbr){
        return Integer.toBinaryString(Integer.parseInt(nbr));
    }
    
    public  String toHex(String nbr){
        return Integer.toHexString(Integer.parseInt(nbr));
    }
    
    public  String toOct(String nbr){
        return Integer.toOctalString(Integer.parseInt(nbr));
    }
    
    public int factorial(int n){
        return (n == 0) ? 1 : n * factorial(n -1);
    }
    
    public double equals(double nbr1, double nbr2, char operation){
        switch (operation){
            case '+': return addTwoNumbers(nbr1, nbr2);
            case '-': return soubstractTwoNumbers(nbr1, nbr2);
            case '/':
                if(nbr2 == 0){
                            JOptionPane.showMessageDialog(new JFrame(),
                                    "La Division Sur 0 est Impossible.",
                                    "Arithmetic Exception",
                                    JOptionPane.WARNING_MESSAGE);
                    break;
                }
                return devideTwoNumbers(nbr1, nbr2);
            case '*': return multiplyTwoNumbers(nbr1, nbr2);
            case '%': return remainderOfDivision(nbr1, nbr2);
            case 'p': return power(nbr1, nbr2);
            default:
                System.out.println("Choix invalid");
        }
        return 0;
    }
}
