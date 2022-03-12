package com.calculatrice.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculatrice extends JFrame{

    //calculatrice variables
    double number1;
    double number2;
    char operation = 'n';
    
    private JPanel mainPanel;
    private JTextField textField;
    private JPanel screenPanel;
    private JPanel labelPanel;
    private JPanel buttonsRow1;
    private JPanel buttonsRow2;
    private JPanel buttonsRow3;
    private JPanel buttonsRow4;
    private JPanel buttonsRow5;
    private JPanel egalPanel;
    private JPanel dotZeroPanel;
    private Btn clear;
    private Btn benaire;
    private Btn modulo;
    private Btn division;
    private Btn seven;
    private Btn eight;
    private Btn nine;
    private Btn multiplication;
    private Btn four;
    private Btn five;
    private Btn six;
    private Btn soubstraction;
    private Btn one;
    private Btn two;
    private Btn three;
    private Btn addition;
    private Btn zero;
    private Btn dot;
    private Btn egal;
    private JLabel infoLabel;
    private GridLayout grid;
    private GridLayout twoCollumnGrid;
    
    public Calculatrice(){
        mainPanel = new JPanel();
        textField = new JTextField();
        screenPanel = new JPanel();
        labelPanel = new JPanel();
        buttonsRow1 = new JPanel();
        buttonsRow2 = new JPanel();
        buttonsRow3 = new JPanel();
        buttonsRow4 = new JPanel();
        buttonsRow5 = new JPanel();
        clear = new Btn("C");
        benaire = new Btn("Bin");
        modulo = new Btn("%");
        division = new Btn("/");
        multiplication = new Btn("X");
        addition = new Btn("+");
        soubstraction = new Btn("-");
        one = new Btn("1");
        two = new Btn("2");
        three = new Btn("3");
        four = new Btn("4");
        five = new Btn("5");
        six = new Btn("6");
        seven = new Btn("7");
        eight = new Btn("8");
        nine = new Btn("9");
        zero = new Btn("0");
        egal = new Btn("=");
        dot = new Btn(".");
        infoLabel = new JLabel();
        egalPanel = new JPanel();
        dotZeroPanel = new JPanel();
        grid =  new GridLayout(0, 4);
        grid.setHgap(5);
        twoCollumnGrid = new GridLayout(0, 2);
        twoCollumnGrid.setHgap(5);
        setContentPane(mainPanel);
        GridLayout gridLayout = new GridLayout(7, 0);
        gridLayout.setVgap(5);
        
        //container
        mainPanel.setLayout(gridLayout);
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.add(screenPanel);
        mainPanel.add(labelPanel);
        mainPanel.add(buttonsRow1);
        mainPanel.add(buttonsRow2);
        mainPanel.add(buttonsRow3);
        mainPanel.add(buttonsRow4);
        mainPanel.add(buttonsRow5);
        
        //screen
        screenPanel.setLayout(new GridLayout());
        screenPanel.add(textField);
        textField.setFont(new Font("Arial", Font.BOLD, 25));
        textField.setEditable(false);
        
        //button rows 1
        buttonsRow1.setLayout(grid);
        buttonsRow1.add(clear);
        buttonsRow1.add(benaire);
        buttonsRow1.add(modulo);
        buttonsRow1.add(division);
        
        //button rows 2
        buttonsRow2.setLayout(grid);
        buttonsRow2.add(seven);
        buttonsRow2.add(eight);
        buttonsRow2.add(nine);
        buttonsRow2.add(multiplication);
        
        //button rows 3
        buttonsRow3.setLayout(grid);
        buttonsRow3.add(four);
        buttonsRow3.add(five);
        buttonsRow3.add(six);
        buttonsRow3.add(soubstraction);
        
        //button rows 4
        buttonsRow4.setLayout(grid);
        buttonsRow4.add(one);
        buttonsRow4.add(two);
        buttonsRow4.add(three);
        buttonsRow4.add(addition);
        
        //button rows 5
        buttonsRow5.setLayout(twoCollumnGrid);
        buttonsRow5.add(dotZeroPanel);
        buttonsRow5.add(egalPanel);

        //label
        labelPanel.add(infoLabel);
        
        //egal Panel
        egalPanel.setLayout(new GridLayout());
        egalPanel.add(egal);
        
        //dot Zero Panel
        dotZeroPanel.setLayout(twoCollumnGrid);
        dotZeroPanel.add(zero);
        dotZeroPanel.add(dot);

        //Events Listeners
        clear.addActionListener(e -> textField.setText(""));

        benaire.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Benaire");
                textField.setText(Integer.toBinaryString(Integer.parseInt(textField.getText())));
            }
        });

        seven.addActionListener(e -> textField.setText(textField.getText() + "7"));
        eight.addActionListener(e -> textField.setText(textField.getText() + "8"));
        nine.addActionListener(e -> textField.setText(textField.getText() + "9"));
        four.addActionListener(e -> textField.setText(textField.getText() + "4"));
        five.addActionListener(e -> textField.setText(textField.getText() + "5"));
        six.addActionListener(e -> textField.setText(textField.getText() + "6"));
        one.addActionListener(e -> textField.setText(textField.getText() + "1"));
        two.addActionListener(e -> textField.setText(textField.getText() + "2"));
        three.addActionListener(e -> textField.setText(textField.getText() + "3"));
        zero.addActionListener(e -> textField.setText(textField.getText() + "0"));
        dot.addActionListener(e -> {
            if(!textField.getText().contains(".")){
                textField.setText(textField.getText() + ".");
            }
        });
        addition.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '+';
                infoLabel.setText("Addition");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        egal.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("");
                number2 = Double.parseDouble(textField.getText());
                switch (operation){
                    case '+': textField.setText(String.valueOf(number1 + number2));break;
                    case '-': textField.setText(String.valueOf(number1 - number2));break;
                    case '/':
                        if(number2 == 0){
//                            JOptionPane.showMessageDialog(new JFrame(),
//                                    "La Division Sur 0 est Impossible.",
//                                    "Arithmetic Exception",
//                                    JOptionPane.WARNING_MESSAGE);
                            infoLabel.setText("La Division Sur 0 est Impossible");
                            clear.doClick();
                            break;
                        }
                        textField.setText(String.valueOf(number1 / number2));
                        break;
                    case '*': textField.setText(String.valueOf(number1 * number2));break;
                    case '%': textField.setText(String.valueOf(number1 % number2));break;
                    default:
                        System.out.println("Something is wrong");
                }
            }
        });
        soubstraction.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '-';
                infoLabel.setText("Subtraction");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        multiplication.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '*';
                infoLabel.setText("Multiplication");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        division.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '/';
                infoLabel.setText("Division");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        modulo.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '%';
                infoLabel.setText("Modulo");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
    }
}
