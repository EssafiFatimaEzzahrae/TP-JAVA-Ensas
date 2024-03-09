package TPJAVA;

import java.util.Scanner;

public class EXO8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre âge : ");
        int age = scanner.nextInt();
        System.out.println("Entrez votre sexe (M pour masculin, F pour féminin) : ");
        char sex = scanner.next().charAt(0);
        boolean isTaxable;
        if (sex == 'M') {
            isTaxable = age > 20;
        } else {
            isTaxable = age >= 18 && age <= 35;
        }
        if (isTaxable) {
            System.out.println("Vous êtes imposable.");
        } else {
            System.out.println("Vous n'êtes pas imposable.");
        }
    }
}