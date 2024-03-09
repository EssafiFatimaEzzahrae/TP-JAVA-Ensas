package TP2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre N : ");
        int N = scanner.nextInt();
        int sum = 0, product = 1;
        double average;
        int i = 0;
        while (i < N) {
            System.out.println("Entrez le nombre " + (i+1) + " : ");
            int num = scanner.nextInt();
            sum += num;
            product *= num;
            i++;
        }
        average = (double) sum / N;
        System.out.println("La somme est : " + sum);
        System.out.println("Le produit est : " + product);
        System.out.println("La moyenne est : " + average);
    }
}

