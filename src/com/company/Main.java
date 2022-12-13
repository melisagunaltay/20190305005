package com.company;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*HospitalData hospitalData = new HospitalData();
        hospitalData.addBolum("Dahiliye");
        hospitalData.addBolum("KBB");
        List<String> bolumler = hospitalData.getBolumler();
        for (Object bolum: bolumler) {
            System.out.println(bolum);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name: ");
        String text = sc.nextLine();
        System.out.println("Your answer: "+text );*/
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
