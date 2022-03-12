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
    private JPanel programmingPanel;
    private JPanel sciencePanel;
    private JPanel secondSciencePanel;
    private JPanel labelPanel;
    private JPanel buttonsRow1;
    private JPanel buttonsRow2;
    private JPanel buttonsRow3;
    private JPanel buttonsRow4;
    private JPanel buttonsRow5;
    private JPanel egalPanel;
    private JPanel dotZeroPanel;
    private Btn clear;
    private Btn fact;
    private Btn hex;
    private Btn oct;
    private Btn benaire;
    private Btn del;
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
    private Btn sin;
    private Btn cos;
    private Btn sqrt;
    private Btn pwrt;
    private Btn floor;
    private Btn ciel;
    private Btn abs;
    private Btn random;
    private JLabel infoLabel;
    private GridLayout grid;
    private GridLayout twoCollumnGrid;
    
    public Calculatrice(){
        mainPanel = new JPanel();
        textField = new JTextField();
        screenPanel = new JPanel();
        sciencePanel = new JPanel();
        secondSciencePanel = new JPanel();
        programmingPanel = new JPanel();
        labelPanel = new JPanel();
        buttonsRow1 = new JPanel();
        buttonsRow2 = new JPanel();
        buttonsRow3 = new JPanel();
        buttonsRow4 = new JPanel();
        buttonsRow5 = new JPanel();
        fact = new Btn("Fact", new Color(145, 53, 211));
        benaire = new Btn("Bin", new Color(133, 47, 196));
        hex = new Btn("Hex", new Color(133, 47, 196));
        oct = new Btn("Oct", new Color(133, 47, 196));
        
        sin = new Btn("Sin", new Color(3, 171, 43));
        cos = new Btn("Cos", new Color(3, 171, 43));
        sqrt = new Btn("√", new Color(3, 171, 43));
        pwrt = new Btn("¬", new Color(3, 171, 43));
        random = new Btn("Rand", new Color(3, 171, 43));
        floor = new Btn("Floor", new Color(3, 171, 43));
        ciel = new Btn("Ciel", new Color(3, 171, 43));
        abs = new Btn("Abs", new Color(3, 171, 43));
        clear = new Btn("C", new Color(255, 0, 0));
        del = new Btn("Del", new Color(255, 0, 0));
        
        modulo = new Btn("%", new Color(255, 50, 153));
        division = new Btn("/", new Color(255, 50, 153));
        multiplication = new Btn("X", new Color(255, 50, 153));
        addition = new Btn("+", new Color(255, 50, 153));
        soubstraction = new Btn("-", new Color(255, 50, 153));
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
        egal = new Btn("=", new Color(0, 126, 96));
        dot = new Btn(".");
        infoLabel = new JLabel();
        egalPanel = new JPanel();
        dotZeroPanel = new JPanel();
        grid =  new GridLayout(0, 4);
        grid.setHgap(5);
        twoCollumnGrid = new GridLayout(0, 2);
        twoCollumnGrid.setHgap(5);
        setContentPane(mainPanel);
        BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        
        //container
        mainPanel.setLayout(boxLayout);
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.add(labelPanel);
        mainPanel.add(screenPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(sciencePanel);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(secondSciencePanel);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(programmingPanel);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(buttonsRow1);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(buttonsRow2);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(buttonsRow3);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(buttonsRow4);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(buttonsRow5);
        
        //screen
        screenPanel.setLayout(new GridLayout());
        screenPanel.add(textField);
        screenPanel.setPreferredSize(new Dimension(300, 60));
        textField.setFont(new Font("Arial", Font.BOLD, 25));
        textField.setEditable(false);
        
        //programming Panel
        programmingPanel.setLayout(grid);
        programmingPanel.add(benaire);
        programmingPanel.add(hex);
        programmingPanel.add(oct);
        programmingPanel.add(fact);
        
        //science Panel
        sciencePanel.setLayout(grid);
        sciencePanel.add(sin);
        sciencePanel.add(cos);
        sciencePanel.add(sqrt);
        sciencePanel.add(pwrt);
        secondSciencePanel.setLayout(grid);
        secondSciencePanel.add(ciel);
        secondSciencePanel.add(floor);
        secondSciencePanel.add(abs);
        secondSciencePanel.add(random);
        
        //button rows 1
        buttonsRow1.setLayout(grid);
        buttonsRow1.add(clear);
        buttonsRow1.add(del);
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
        labelPanel.setMinimumSize(new Dimension(400, 30));
        labelPanel.setPreferredSize(new Dimension(400, 30));
        labelPanel.setMaximumSize(new Dimension(400, 30));
        
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
        hex.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Hex");
                textField.setText(Integer.toHexString(Integer.parseInt(textField.getText())));
            }
        });
        oct.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Benaire");
                textField.setText(Integer.toOctalString(Integer.parseInt(textField.getText())));
            }
        });
        fact.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Facturial");
                textField.setText(String.valueOf(Utility.factorial(Integer.parseInt(textField.getText()))));
            }
        });
        sin.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Sin");
                textField.setText(String.valueOf(Math.sin(Double.parseDouble(textField.getText()))));
            } 
        });
        cos.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Cos");
                textField.setText(String.valueOf(Math.cos(Double.parseDouble(textField.getText()))));
            } 
        });
        sqrt.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Square");
                textField.setText(String.valueOf(Math.sqrt(Double.parseDouble(textField.getText()))));
            } 
        });
        pwrt.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = 'p';
                infoLabel.setText("Power");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        ciel.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Smallest Integer Value");
                textField.setText(String.valueOf(Math.ceil(Double.parseDouble(textField.getText()))));
            }
        });
        abs.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Absolute Value");
                textField.setText(String.valueOf(Math.abs(Double.parseDouble(textField.getText()))));
            }
        });
        random.addActionListener(e -> {
                infoLabel.setText("Random Number Generated");
                textField.setText(String.valueOf(Math.floor(Math.random() * 10)));
        });
        floor.addActionListener(e -> {
            if(!textField.getText().equals("")){
                infoLabel.setText("Largest Integer Value");
                textField.setText(String.valueOf(Math.floor(Double.parseDouble(textField.getText()))));
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
                    case 'p': textField.setText(String.valueOf(Math.pow(number1, number2)));break;
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
        del.addActionListener(e -> {
            if(!textField.equals("")) {
                textField.setText(textField.getText().substring(0, textField.getText().length()-1));
            }
        });
    }
}
