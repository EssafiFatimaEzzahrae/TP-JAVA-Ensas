package TP1;

import java.util.Scanner;
public class Exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez a et b pour l'équation ax + b = 0 : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("La solution est : " + x);
        } else if (b == 0) {
            System.out.println("L'équation a une infinité de solutions.");
        } else {
            System.out.println("L'équation n'a pas de solution.");
        }
    }
}