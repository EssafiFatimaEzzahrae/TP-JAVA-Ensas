import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le rayon d'un cercle : ");
        double r = scanner.nextDouble();
        System.out.println("La surface du cercle est : " + (Math.PI * r * r));
        System.out.println("Le périmètre du cercle est : " + (2 * Math.PI * r));
    }
}
