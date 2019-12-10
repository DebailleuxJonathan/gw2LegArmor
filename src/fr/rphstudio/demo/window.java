package fr.rphstudio.demo;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class window extends JFrame {


    private JPanel Panel = new JPanel();
    private JButton bouton = new JButton("Mon bouton");

    public window(){
        this.setTitle("Armure Légendaire");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Animation");
        this.setSize(   300, 300);
        //Ajout du bouton à notre content pane
        Panel.add(bouton);
        this.setContentPane(Panel);
        this.setVisible(true);
        //////////////
        this.setContentPane(new Panel());







    }
}
