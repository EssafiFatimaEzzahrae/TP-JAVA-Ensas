import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un réel et un entier : ");
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(x + " à la puissance " + n + " est : " + Math.pow(x, n));
    }
}