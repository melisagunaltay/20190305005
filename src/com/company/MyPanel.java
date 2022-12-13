package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JTextField jcomp3;
    private JLabel jcomp4;
    private JTextField jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JTextField jcomp9;
    private JLabel jcomp10;
    private JTextField jcomp11;
    private JLabel jcomp12;

    public MyPanel() {
        //construct components
        jcomp1 = new JLabel ("ALTAY hospital online appointment");
        jcomp2 = new JLabel ("ID No");
        jcomp3 = new JTextField (5);
        jcomp4 = new JLabel ("Name Surname");
        jcomp5 = new JTextField (5);
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("");
        jcomp8 = new JLabel ("Department");
        jcomp9 = new JTextField (5);
        jcomp10 = new JLabel ("Doctors");
        jcomp11 = new JTextField (5);
        jcomp12 = new JLabel ("Date");

        //adjust size and set layout
        setPreferredSize (new Dimension(497, 417));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (35, 10, 440, 52);
        jcomp2.setBounds (20, 110, 100, 25);
        jcomp3.setBounds (130, 190, 235, 25);
        jcomp4.setBounds (15, 150, 100, 25);
        jcomp5.setBounds (130, 110, 235, 25);
        jcomp6.setBounds (130, 151, 235, 25);
        jcomp7.setBounds (60, 250, 100, 25);
        jcomp8.setBounds (15, 190, 100, 25);
        jcomp9.setBounds (130, 230, 235, 25);
        jcomp10.setBounds (15, 230, 100, 25);
        jcomp11.setBounds (130, 270, 235, 25);
        jcomp12.setBounds (15, 270, 100, 25);
    }
}

