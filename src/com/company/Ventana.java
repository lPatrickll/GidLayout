package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton Boton1=new JButton("1");
    private JButton Boton2=new JButton("2");
    private JButton Boton3=new JButton("3");
    private JButton Boton4=new JButton("4");
    private JButton Boton5=new JButton("5");
    private JButton Boton6=new JButton("6");
    public Ventana(){
        super("ejemplo de borderLayout");
        setLayout(new GridLayout(2,3));
        add(Boton1);
        add(Boton2);
        add(Boton3);
        add(Boton4);
        add(Boton5);
        add(Boton6);
    }
}
