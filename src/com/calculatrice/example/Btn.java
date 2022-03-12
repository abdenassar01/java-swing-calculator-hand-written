package com.calculatrice.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Btn extends JButton {
    
    public Btn(String text){
        this.setText(text);
        this.setBackground(new Color(72, 141, 218));
        this.setForeground(Color.WHITE);
    }
}
