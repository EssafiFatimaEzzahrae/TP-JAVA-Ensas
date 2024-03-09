package TPJAVA;

import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez deux entiers : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sumN = 0, sumM = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumN += i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sumM += i;
            }
        }
        if (sumN == m && sumM == n) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }
    }
}
