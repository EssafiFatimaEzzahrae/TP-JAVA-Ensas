package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau : ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrez l'élément " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double average = (double) sum / N;
        System.out.println("La somme est : " + sum);
        System.out.println("La moyenne est : " + average);

        // Copier le tableau dans un deuxième tableau T2 et l’afficher
        int[] T2 = Arrays.copyOf(array, array.length);
        System.out.println("Le deuxième tableau est : " + Arrays.toString(T2));

        // Classer les éléments du tableau dans un ordre croissant
        Arrays.sort(array);
        System.out.println("Le tableau trié est : " + Arrays.toString(array));
    }
}
