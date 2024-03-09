package TP3;
import java.util.Scanner;

class EXO4 {
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
        int[] newArray = new int[N];
        int j = 0;
        for (int i : array) {
            if (i != 5) {
                newArray[j++] = i;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(newArray[i]);
        }
    }
}

