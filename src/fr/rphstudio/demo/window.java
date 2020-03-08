package fr.rphstudio.demo;



import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class window extends JFrame{
    CardLayout cl = new CardLayout();
    JPanel content = new JPanel();
    JButton bouton,bouton2;
    JLabel nombrecoupon_label,escarmouche_label, somme,somme1, somme2, somme3, somme1_text,somme2_text,somme3_text, somme_text;
    JTextField nombrecoupon_text,escarmouche_text;



    public window() throws Exception {
        this.setTitle("Armure légendaire");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(content);
        content.setLayout(null);


        //change color font : nombrecoupon_label.setForeground(Color.BLACK);
                //


        ImageIcon icon = new ImageIcon("zatnecro.png");
        JLabel logo = new JLabel("", icon, JLabel.CENTER);
        logo.setBounds(-1080,-400,1920,1080);

        nombrecoupon_label = new JLabel("Votre nombre de coupon : ");
        nombrecoupon_label.setBounds(125 ,20,251,31);
        nombrecoupon_label.setForeground(Color.BLACK);
        content.add(nombrecoupon_label);

        escarmouche_label = new JLabel("Point d'escarmouche par 5 min : ");
        escarmouche_label.setBounds(125,60,251,31);
        escarmouche_label.setForeground(Color.BLACK);
        content.add(escarmouche_label);
                //
        nombrecoupon_text = new JTextField();
        nombrecoupon_text.setBounds(325,20,50,31);
        nombrecoupon_text.setForeground(Color.BLACK);
        content.add(nombrecoupon_text);

        escarmouche_text = new JTextField();
        escarmouche_text.setBounds(325,60,50,31);
        escarmouche_text.setForeground(Color.BLACK);
        content.add(escarmouche_text);
                //
        bouton = new JButton("SUBMIT");
        bouton.setBounds(30,150,251,31);
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    if(nombrecoupon_text != null && escarmouche_text !=null){
                setSize(600,500);
                String coupon = nombrecoupon_text.getText();
                String couponesca = escarmouche_text.getText();
                int couponfinal = 7880;
                int sommei = (couponfinal / 365) - (Integer.parseInt(coupon) / 365);


                somme3 = new JLabel((couponfinal) - (Integer.parseInt(coupon)) +" "+"coupons");
                somme3.setBounds(31,220,251,31);
                somme3.setForeground(Color.GREEN);
                content.add(somme3);
                somme3_text = new JLabel("Il vous manque : ");
                somme3_text.setBounds(31,200,251,31);
                somme3_text.setForeground(Color.GREEN);
                content.add(somme3_text);

                somme = new JLabel(sommei + " "+"semaines");
                somme.setBounds(31,260,250,31);
                somme.setForeground(Color.GREEN);
                content.add(somme);
                somme_text = new JLabel("Il vous reste encore : ");
                somme_text.setBounds(31,240,251,31);
                somme_text.setForeground(Color.green);
                content.add(somme_text);

                somme1 = new JLabel(((1450*5/Integer.parseInt(couponesca)/60)* sommei)+" "+ "heures");
                somme1.setForeground(Color.green);
                somme1.setBounds(31,300,251,31);
                content.add(somme1);
                somme1_text = new JLabel("Pour un nombre total de : ");
                somme1_text.setBounds(31,280,251,31);
                somme1_text.setForeground(Color.green);
                content.add(somme1_text);

                somme2 = new JLabel((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
                somme2.setBounds(31,340,500,31);
                somme2.setForeground(Color.GREEN);
                content.add(somme2);
                somme2_text = new JLabel("Il vous faut jouer : ");
                somme2_text.setBounds(31,320,511,31);
                somme2_text.setForeground(Color.GREEN);
                content.add(somme2_text);
                        ImageIcon icon1 = new ImageIcon("necrotest.png");
                        JLabel logo1 = new JLabel("", icon1, JLabel.CENTER);
                        logo1.setBounds(0  ,190,400,200);
                        content.add(logo1);
                        content.add(logo);



                    }else{
                        JOptionPane.showMessageDialog(bouton, "Data are empty");
                }}
                catch (Exception ae){
                    JOptionPane.showMessageDialog(bouton, "Data are empty");
                    ae.printStackTrace();

                }



            }
        });


        bouton2 = new JButton("RESET");
        bouton2.setBounds(300,150,251,31);
        bouton2.addActionListener(actionEvent -> {

            try {
                dispose();
                new window();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });



        content.add(bouton);
        content.add(bouton2);

        content.add(logo);


        this.setVisible(true);


        //apparence

    }
}





