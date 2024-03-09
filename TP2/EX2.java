package TP2;

import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre X : ");
        int X = scanner.nextInt();
        System.out.println("Entrez le nombre N : ");
        int N = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < N; i++) {
            result *= X;
        }
        System.out.println("X^N est : " + result);
    }
}