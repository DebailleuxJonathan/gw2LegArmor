package fr.rphstudio.demo.text;

import javax.swing.*;

public class textBotteLourd extends JTextArea {
    public textBotteLourd(){
        setText("(Légendaire) Espauliers du Héros triomphant de la forge des Brumes : \n" + "Vous devez avoir avant le rang McM 1600 ainsi que l’apparence des Espauliers du Héros triomphant de la forge des Brumes en rareté élevé. \n"
                +
                "\n" +
                "Le craft :\n" +
                "\n" +
                "- 1 Espauliers du Héros triomphant de la forge des Brumes (élevé)\n" +
                "- 1 Don de prospérité de la guerre\n" +
                "- 1 Don de prouesse de guerre\n" +
                "- 1  Don d'ardeur au combat\n" +
                "\n" +
                "Récap’ :\n" +
                "Vous aurez besoin de: 1795 Billets de retrait d'escarmouche McM ");



        setEditable(false);
        setOpaque(false);
        setLineWrap(true);
        setWrapStyleWord(true);
    }
}
