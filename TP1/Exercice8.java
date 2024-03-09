package TP1;
import java.util.Scanner;
public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez deux entiers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int pgcd = pgcd(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }

    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }
}