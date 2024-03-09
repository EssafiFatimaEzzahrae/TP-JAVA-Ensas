package TP3;
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.println("Entrez la taille du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrez l'élément " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}