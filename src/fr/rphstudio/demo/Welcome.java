package fr.rphstudio.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {


    JPanel content = new JPanel();
    JButton bouton,bouton2;
    JLabel nombrecoupon_label,escarmouche_label,  somme1_text,somme2_text,somme3_text, somme_text;
    private JTextField nombrecoupon_text,escarmouche_text,somme2,somme,somme1,  somme3;
    JTextArea text_label;
    JRadioButton checkT2, checkT3;


    public Welcome(){

        this.setTitle("Armure légendaire");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(content);
        content.setLayout(null);



       /* text_label = new JTextArea("Bonjour voici une appli pour faire vos simulations\nconcernant votre  expérience mcm, comme le temps \npour faire votre armure légendaire");

        text_label.setFont(new Font("Serif", Font.BOLD, 16));
        text_label.setEditable(false);
        text_label.setOpaque(false);
        text_label.setBounds(0,0,400,251);
        content.add(text_label);*/

        checkT2 = new JRadioButton("Armure légendaire T2");
        checkT2.setBounds(0,0,251,31);
        checkT3 = new JRadioButton("Armure légendaire T3");
        checkT3.setBounds(0,40,251,31);
        ButtonGroup buttonarmure = new ButtonGroup();
        buttonarmure.add(checkT2);
        buttonarmure.add(checkT3);
        checkT3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(event.getSource() == checkT2){
                    System.out.println("T2");
                }
            }
        });
        checkT2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(event.getSource() == checkT3){
                    System.out.println("T3");
                }
            }
        });
        content.add(checkT2);
        content.add(checkT3);

        nombrecoupon_label = new JLabel("Votre nombre de coupon : ");
        nombrecoupon_label.setBounds(0 ,100,251,31);
        nombrecoupon_label.setForeground(Color.BLACK);
        content.add(nombrecoupon_label);

        escarmouche_label = new JLabel("Point d'escarmouche par 5 min : ");
        escarmouche_label.setBounds(0,140,251,31);
        escarmouche_label.setForeground(Color.BLACK);
        content.add(escarmouche_label);
        //
        nombrecoupon_text = new JTextField();
        nombrecoupon_text.setBounds(200,100,50,31);
        nombrecoupon_text.setForeground(Color.BLACK);
        content.add(nombrecoupon_text);

        escarmouche_text = new JTextField();
        escarmouche_text.setBounds(200,140,50,31);
        escarmouche_text.setForeground(Color.BLACK);
        content.add(escarmouche_text);
        //
        somme3_text = new JLabel("Il vous manque : ");
        somme3_text.setBounds(401,0,251,31);
        somme3_text.setForeground(Color.BLACK);
        content.add(somme3_text);
        somme3 = new JTextField();
        somme3.setBounds(401,30,100,26);
        somme3.setForeground(Color.BLACK);
        somme3.setEditable(false);
        content.add(somme3);

        somme_text = new JLabel("Il vous reste encore : ");
        somme_text.setBounds(401,50,251,31);
        somme_text.setForeground(Color.BLACK);
        content.add(somme_text);
        somme = new JTextField();
        somme.setBounds(401,80,100,26);
        somme.setForeground(Color.BLACK);
        somme.setEditable(false);
        content.add(somme);


        somme1_text = new JLabel("Pour un nombre total de : ");
        somme1_text.setBounds(401,100,251,31);
        somme1_text.setForeground(Color.BLACK);
        content.add(somme1_text);
        somme1 = new JTextField();
        somme1.setBounds(401,130,72,26);
        somme1.setForeground(Color.BLACK);
        somme1.setEditable(false);
        content.add(somme1);

        somme2_text = new JLabel("Il vous faut jouer : ");
        somme2_text.setBounds(401,150,511,31);
        somme2_text.setForeground(Color.BLACK);
        content.add(somme2_text);
        somme2 = new JTextField();
        somme2.setBounds(401,180,62,26);
        somme2.setForeground(Color.BLACK);
        somme2.setEditable(false);
        content.add(somme2);
        //
        bouton = new JButton("SUBMIT");
            bouton.setBounds(0,200,251,31);

            bouton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                    if(nombrecoupon_text != null && escarmouche_text !=null && checkT2.isSelected()){
                        setSize(600,400);
                        String coupon = nombrecoupon_text.getText();
                        String couponesca = escarmouche_text.getText();
                        int couponfinal = 7880;
                        int sommei = (couponfinal / 365) - (Integer.parseInt(coupon) / 365);


                        // somme3 = new JLabel((couponfinal) - (Integer.parseInt(coupon)) +" "+"coupons");
                        somme3.setText((couponfinal) - (Integer.parseInt(coupon)) +" "+"coupons");
                        somme3.setBounds(401,30,100,26);
                        somme3.setForeground(Color.BLACK);
                        content.add(somme3);


                        // somme = new JLabel(sommei + " "+"semaines");
                        somme.setText((sommei + " "+"semaines"));
                        somme.setBounds(401,80,100,26);
                        somme.setForeground(Color.BLACK);
                        content.add(somme);


                        //somme1 = new JLabel(((1450*5/Integer.parseInt(couponesca)/60)* sommei)+" "+ "heures");
                        somme1.setText(((1450*5/Integer.parseInt(couponesca)/60)* sommei)+" "+ "heures");
                        somme1.setForeground(Color.BLACK);
                        somme1.setBounds(401,130,72,26);
                        content.add(somme1);


                        //somme2 = new JTextField((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
                        somme2.setText((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures");
                        somme2.setBounds(401,180,62,26);
                        somme2.setForeground(Color.BLACK);
                        content.add(somme2);
                        System.out.println("bitch");
                    }

                        if(nombrecoupon_text != null && escarmouche_text !=null && checkT3.isSelected()){
                            setSize(600,400);
                            String coupon = nombrecoupon_text.getText();
                            String couponesca = escarmouche_text.getText();
                            int couponfinal = 8880;
                            int sommei = (couponfinal / 365) - (Integer.parseInt(coupon) / 365);


                            // somme3 = new JLabel((couponfinal) - (Integer.parseInt(coupon)) +" "+"coupons");
                            somme3.setText((couponfinal) - (Integer.parseInt(coupon)) +" "+"coupons");
                            somme3.setBounds(401,30,100,26);
                            somme3.setForeground(Color.BLACK);
                            content.add(somme3);


                            // somme = new JLabel(sommei + " "+"semaines");
                            somme.setText((sommei + " "+"semaines"));
                            somme.setBounds(401,80,100,26);
                            somme.setForeground(Color.BLACK);
                            content.add(somme);


                            //somme1 = new JLabel(((1450*5/Integer.parseInt(couponesca)/60)* sommei)+" "+ "heures");
                            somme1.setText(((1450*5/Integer.parseInt(couponesca)/60)* sommei)+" "+ "heures");
                            somme1.setForeground(Color.BLACK);
                            somme1.setBounds(401,130,72,26);
                            content.add(somme1);


                            //somme2 = new JTextField((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
                            somme2.setText((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures");
                            somme2.setBounds(401,180,62,26);
                            somme2.setForeground(Color.BLACK);
                            content.add(somme2);
                    }else
                        {

                        }
                    }

                catch (Exception ae){
                    JOptionPane.showMessageDialog(bouton, "Data are empty");
                    ae.printStackTrace();

                }




            }
    });
        ImageIcon icon1 = new ImageIcon("Billet_de_retrait_d'escarmouche_McM.png");
        JLabel logo1 = new JLabel("", icon1, JLabel.CENTER);
        logo1.setBounds(165 ,95,251,60);
        content.add(logo1);

        bouton2 = new JButton("RESET");
        bouton2.setBounds(0,235,251,31);
        bouton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nombrecoupon_text.setText("");
                escarmouche_text.setText("");
                somme.setText("");
                somme1.setText("");
                somme2.setText("");
                somme3.setText("");
            }
        });

        content.add(bouton);
        content.add(bouton2);

            setVisible(true);
    }



    }




