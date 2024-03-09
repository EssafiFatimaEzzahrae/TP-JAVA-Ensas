package TP2;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre N : ");
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + sum);
    }
}
