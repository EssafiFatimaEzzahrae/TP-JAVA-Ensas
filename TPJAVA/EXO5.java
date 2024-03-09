package TPJAVA;

import java.util.Scanner;

public class EXO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] goals = new int[22];
        int totalGoals = 0, goallessPlayers = 0, topScorer = 0;
        for (int i = 0; i < 22; i++) {
            System.out.println("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " : ");
            goals[i] = scanner.nextInt();
            totalGoals += goals[i];
            if (goals[i] == 0) {
                goallessPlayers++;
            }
            if (goals[i] > goals[topScorer]) {
                topScorer = i;
            }
        }
        System.out.println("Le numéro du meilleur buteur est : " + (topScorer + 1));
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalGoals);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + goallessPlayers);
        System.out.println("Le joueur n° 9 vient d'inscrire 2 buts.");
        goals[8] += 2;
    }
}
