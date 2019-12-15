package fr.rphstudio.demo;

import javax.swing.*;
import java.util.Scanner;

public class Calcul {

    public static void CalculArmure() throws Exception {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de coupon que vous avez: ");
        int coupon = scanner.nextInt();
        int couponfinal = 7880;
        int somme = (couponfinal-coupon)/365;
        System.out.println("Entrez maintenant le nombre de pts d'escarmouche que vous gagniez toutes les 5 min:");
        int somme1 = 1450*5/scanner.nextInt()/60;
        int somme2 = somme1 * somme;
        int somme3 = couponfinal-coupon;

        System.out.println("Il vous manque" +" "+ somme3 +" "+"coupons");
        System.out.println("Il vous reste encore"+" "+ somme+" "+"semaines" );
        System.out.println("Il vous faut jouer"+" "+ somme1+" "+"heures par semaine pour avoir les 365 tickets hebdomadaire");
        System.out.println("Pour un nombre total de"+" "+somme2+" "+ "heures");
    }
}
