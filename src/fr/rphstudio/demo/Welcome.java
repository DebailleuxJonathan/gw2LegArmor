package fr.rphstudio.demo;

import fr.rphstudio.demo.text.textEpauleLourd;
import fr.rphstudio.demo.text.textHeaumeLourd;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Welcome extends JFrame {


    JPanel generalPanel = new JPanel(new BorderLayout());
    JPanel content = new JPanel();
    JPanel northPanel = new JPanel(new GridLayout());
    JPanel southPanel = new JPanel(new GridLayout());



    JButton bouton,bouton2;
    JLabel nombrecoupon_label,escarmouche_label,  somme1_text,somme2_text,somme3_text, somme_text;
    private JTextField nombrecoupon_text,escarmouche_text,somme2,somme,somme1,  somme3;
    JTextArea text_label;
    JRadioButton checkT2, checkT3;

    ImageIcon icon1 = new ImageIcon("Billet_de_retrait_d'escarmouche_McM.png");
    //ImageIcon icon2 = new ImageIcon("armure_lourde.png");

   // JTextArea textCasque = new JTextArea();
   // JTextArea textEpaule = new JTextArea();


    public Welcome(){

        this.setTitle("Armure légendaire");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(content);
        content.setLayout(null);
        //content.setLayout(new FlowLayout());


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
        checkT3.addActionListener(event -> {
            if(event.getSource() == checkT2){
                System.out.println("T2");
            }
        });
        checkT2.addActionListener(event -> {
            if(event.getSource() == checkT3){
                System.out.println("T3");
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
        nombrecoupon_text.setDocument(new JTextFieldLimit(5));
        content.add(nombrecoupon_text);

        escarmouche_text = new JTextField();
        escarmouche_text.setBounds(200,140,50,31);
        escarmouche_text.setForeground(Color.BLACK);
        escarmouche_text.setDocument(new JTextFieldLimit(2));
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
        somme1.setBounds(401,130,100,26);
        somme1.setForeground(Color.BLACK);
        somme1.setEditable(false);
        content.add(somme1);

        somme2_text = new JLabel("Il vous faut jouer : ");
        somme2_text.setBounds(401,150,511,31);
        somme2_text.setForeground(Color.BLACK);
        content.add(somme2_text);
        somme2 = new JTextField();
        somme2.setBounds(401,180,100,26);
        somme2.setForeground(Color.BLACK);
        somme2.setEditable(false);
        content.add(somme2);

        JLabel somme2Label = new JLabel("par semaines");
        somme2Label.setBounds(505,180,100,26);
        somme2Label.setForeground(Color.BLACK);
        content.add(somme2Label);

        //
        bouton = new JButton("SUBMIT");
            bouton.setBounds(0,200,251,31);

            bouton.addActionListener(actionEvent -> {
                try{
                if(nombrecoupon_text != null && escarmouche_text !=null && checkT2.isSelected()){
                    setSize(1200,800);
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
                    somme1.setBounds(401,130,100,26);
                    content.add(somme1);


                    //somme2 = new JTextField((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
                    somme2.setText((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures");
                    somme2.setBounds(401,180,100,26);
                    somme2.setForeground(Color.BLACK);
                    content.add(somme2);
                    System.out.println("bitch");
                }

                    if(nombrecoupon_text != null && escarmouche_text !=null && checkT3.isSelected()){
                        setSize(1200,800);
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
                        somme1.setBounds(401,130,100,26);
                        content.add(somme1);


                        //somme2 = new JTextField((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
                        somme2.setText((1450*5/Integer.parseInt(couponesca)/60)+" "+"heures");
                        somme2.setBounds(401,180,100,26);
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




        });

        JLabel logo1 = new JLabel("", icon1, JLabel.CENTER);
        logo1.setBounds(165 ,95,251,60);
        content.add(logo1);

        bouton2 = new JButton("RESET");
        bouton2.setBounds(0,235,251,31);
        bouton2.addActionListener(actionEvent -> {
            nombrecoupon_text.setText("");
            escarmouche_text.setText("");
            somme.setText("");
            somme1.setText("");
            somme2.setText("");
            somme3.setText("");
        });

        content.add(bouton);
        content.add(bouton2);



        JButton terazze = new JButton("azeza");
        northPanel.add(terazze);

        //
        JTabbedPane tabbedPane = new JTabbedPane();
        southPanel.add(tabbedPane);
        JComponent testTab= (JComponent) makeTextPanel();
        tabbedPane.addTab("Léger",testTab);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        Component testTab1=  makeTextPanel2();
        tabbedPane.addTab("Intermédiaire",testTab1);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_0);
        Component testTab2=  makeTextPanel2();
        tabbedPane.addTab("Lourd",testTab2);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_0);


        //
        add(generalPanel);
        generalPanel.add(content,BorderLayout.CENTER);
        generalPanel.add(northPanel,BorderLayout.NORTH);
        generalPanel.add(southPanel,BorderLayout.SOUTH);

            setVisible(true);
    }





    public static class JTextFieldLimit extends PlainDocument {
        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
            if (str == null) return;

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }

    protected Component makeTextPanel() {
        textHeaumeLourd textCasque = new textHeaumeLourd();
        textEpauleLourd textEpaule = new textEpauleLourd();

        JPanel panel = new JPanel(false);
        JPanel testpanel = new JPanel();
        testpanel.setLayout(null);
//       JLabel label = new JLabel("Léger");
//        label.setHorizontalAlignment(JLabel.CENTER);
       JLabel label1 = new JLabel("Intermédiaire");
        label1.setHorizontalAlignment(JLabel.CENTER);
       JLabel label2 = new JLabel();
       label2.setBounds(0,0,200,400);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("armure_lourde.png").getImage().getScaledInstance(170, 420, Image.SCALE_DEFAULT));
        label2.setIcon(imageIcon);


        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("heaume_lourd.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JButton test = new JButton(imageIcon1);
        test.addActionListener(e->{
            textEpaule.setVisible(false);
            textCasque.setVisible(true);
        });

        testpanel.add(test);
        test.setBounds(5,20,40,40);
        textCasque.setBounds(50,20,800,400);
        textCasque.setVisible(false);
        testpanel.add(textCasque);





        ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("epaule_lourd.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JButton test2 = new JButton(imageIcon2);
        test2.addActionListener(e->{
            textCasque.setVisible(false);
            textEpaule.setVisible(true);
        });
        testpanel.add(test2);
        test2.setBounds(5,70,40,40);
        textEpaule.setBounds(50,20,800,400);
        textEpaule.setVisible(false);
        testpanel.add(textEpaule);



        ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("plastron_lourd.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JButton test3 = new JButton(imageIcon3);
        testpanel.add(test3);
        test3.setBounds(5,120,40,40);




        ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("jambiere_lourd.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JButton test4 = new JButton(imageIcon4);
        testpanel.add(test4);
        test4.setBounds(5,170,40,40);




        ImageIcon imageIcon5 = new ImageIcon(new ImageIcon("chaussure_lourd.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JButton test5 = new JButton(imageIcon5);
        testpanel.add(test5);
        test5.setBounds(5,220,40,40);




        

        panel.setLayout(new BorderLayout());
        panel.add(label2,BorderLayout.WEST);
        panel.add(testpanel,BorderLayout.CENTER);
//        panel.add(label,BorderLayout.EAST);

        return panel;
    }
    protected Component makeTextPanel2() {
        JPanel panel = new JPanel(false);
        JButton etst = new JButton("out");
        JButton etst1 = new JButton("out");
        JButton etst2 = new JButton("out");
        JButton etst3 = new JButton("out");

        panel.setLayout(new GridLayout(1, 1));
        panel.add(etst);
        panel.add(etst1);
        panel.add(etst2);
        panel.add(etst3);

        return panel;
    }


    }




