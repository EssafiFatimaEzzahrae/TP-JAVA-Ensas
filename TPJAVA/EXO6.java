package TPJAVA;

import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre poids en kg : ");
        double weight = scanner.nextDouble();
        System.out.println("Entrez votre taille en m : ");
        double height = scanner.nextDouble();
        System.out.println("Entrez votre sexe (M pour masculin, F pour féminin) : ");
        char sex = scanner.next().charAt(0);
        double bmi = weight / (height * height);
        String weightStatus;
        if (sex == 'M') {
            if (bmi < 20) {
                weightStatus = "Maigreur";
            } else if (bmi < 25) {
                weightStatus = "Poids normal";
            } else if (bmi < 30) {
                weightStatus = "Surcharge pondérale";
            } else if (bmi < 40) {
                weightStatus = "Adiposité";
            } else {
                weightStatus = "Obésité";
            }
        } else {
            if (bmi < 19) {
                weightStatus = "Maigreur";
            } else if (bmi < 24) {
                weightStatus = "Poids normal";
            } else if (bmi < 30) {
                weightStatus = "Surcharge pondérale";
            } else if (bmi < 40) {
                weightStatus = "Adiposité";
            } else {
                weightStatus = "Obésité";
            }
        }
        System.out.println("Votre IMC est : " + bmi);
        System.out.println("Votre état de poids est : " + weightStatus);
    }
}
