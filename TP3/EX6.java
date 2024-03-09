package TP3;

// Exercice 6
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau : ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrez l'élément " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        int[] TP = new int[N];
        int[] TN = new int[N];
        int j = 0, k = 0;
        for (int i : array) {
            if (i > 0) {
                TP[j++] = i;
            } else if (i < 0) {
                TN[k++] = i;
            }
        }
        System.out.println("Tableau TP : ");
        for (int i = 0; i < j; i++) {
            System.out.println(TP[i]);
        }
        System.out.println("Tableau TN : ");
        for (int i = 0; i < k; i++) {
            System.out.println(TN[i]);
        }
    }
}

