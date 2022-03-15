package com.calculatrice.example.graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Btn extends JButton {
    
    public Btn(String text){
        this.setText(text);
        this.setBackground(new Color(72, 141, 207));
        this.setForeground(Color.WHITE);
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
    }
    
    public Btn(String text, Color color){
        this(text);
        this.setBackground(color);
    }
}
