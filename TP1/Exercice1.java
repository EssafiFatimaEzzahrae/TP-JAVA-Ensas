package TP1;
import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez deux entiers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("La somme est : " + (a + b));
        System.out.println("La différence est : " + (a - b));
        System.out.println("Le produit est : " + (a * b));
        if (b != 0) {
            System.out.println("Le quotient est : " + (a / b));
        } else {
            System.out.println("Division par zéro n'est pas possible");
        }
    }
}