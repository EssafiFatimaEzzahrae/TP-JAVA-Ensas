package TPJAVA;

import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier positif : ");
        int n = scanner.nextInt();
        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("Le nombre de diviseurs est : " + count);
        System.out.println("La somme des diviseurs est : " + sum);
    }
}