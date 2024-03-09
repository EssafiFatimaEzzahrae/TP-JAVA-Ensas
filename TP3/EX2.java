package TP3;

import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrez l'élément " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}