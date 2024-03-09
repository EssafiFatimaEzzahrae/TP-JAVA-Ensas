package TP1;

import java.util.Scanner;
public class Exercice3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez deux entiers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Après permutation, a = " + a + " et b = " + b);
    }
}
