package TPJAVA;

import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'heure : ");
        int hour = scanner.nextInt();
        System.out.println("Entrez les minutes : ");
        int minute = scanner.nextInt();
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
        System.out.println("Il sera " + hour + " heure(s) " + minute);
    }
}

