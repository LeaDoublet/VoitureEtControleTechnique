package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'année en cours : ");
        int currentYear = scanner.nextInt();

        Voiture voiture1 = new Voiture(Couleur.BLEU,10,25.2,25.0,Direction.OUEST, new Date(2018), null);
        Voiture voiture2 = new Voiture(Couleur.BLEU,10,25.2,25.0,Direction.OUEST, new Date(2016), null);
        Voiture voiture3 = new Voiture(Couleur.BLEU,10,25.2,25.0,Direction.OUEST, new Date(2014), null);
        Voiture voiture4 = new Voiture(Couleur.BLEU,10,25.2,25.0,Direction.OUEST,new Date(2014), new Date(2018));
        Voiture voiture5 = new Voiture(Couleur.BLEU,10,25.2,25.0,Direction.OUEST, new Date(2013), new Date(2015));

        // Mettez vos objets Voiture dans un tableau pour faciliter la boucle
        Voiture[] voitures = {voiture1, voiture2, voiture3, voiture4, voiture5};

        // Boucle pour parcourir les voitures existantes
        for (Voiture voiture : voitures) {
            System.out.println("\nVoiture: " + voiture);
            voiture.evalueCT(currentYear);
        }


    }
}