package fr.rphstudio.demo.text;

import javax.swing.*;
import java.awt.*;

public class textHeaumeLourd extends JTextArea {
    public textHeaumeLourd(){
        setText("(Légendaire) Heaume de guerre du Héros triomphant de la forge des Brumes : \n" + "Vous devez avoir avant le rang McM 1800 ainsi que l’apparence du Heaume de guerre du Héros triomphant de la forge des Brumes en rareté élevé. \n"
                +
                "\n" +
                "Le craft :\n" +
                "\n" +
                "- 1 Heaume de guerre du Héros triomphant de la forge des Brumes (élevé)\n" +
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
