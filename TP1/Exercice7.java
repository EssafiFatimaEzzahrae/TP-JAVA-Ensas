import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez a, b et c pour l'équation ax^2 + bx + c = 0 : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("L'équation a deux solutions : " + x1 + " et " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("L'équation a une solution : " + x);
        } else {
            System.out.println("L'équation n'a pas de solution réelle.");
        }
    }
}