package fr.rphstudio.demo;

import javafx.scene.layout.Pane;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame{
    CardLayout cl = new CardLayout();
    JPanel content = new JPanel();
    FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);


    public window() throws Exception {
        this.setTitle("CardLayout");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel boutonPane = new Panel();
        JButton bouton = new JButton("Contenu suivant");
        JButton bouton2 = new JButton("Contenu avant");
        JCheckBox check1 = new JCheckBox("AHHHH");
        //Définition de l'action du bouton
        boutonPane.add(bouton);
        boutonPane.add(bouton2);
        boutonPane.add(check1);
        //On définit le layout
        this.getContentPane().setLayout(f1);
        this.getContentPane().add(boutonPane, BorderLayout.NORTH);
        this.getContentPane().add(content, BorderLayout.CENTER);
        this.setVisible(true);


        //apparence

    }
}




