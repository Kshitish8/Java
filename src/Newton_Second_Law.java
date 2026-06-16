
import java.util.Scanner;

public class Newton_Second_Law {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double u;
        do {
            System.out.print("Enter initial velocity (u): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                scanner.next();
            }
            u = scanner.nextDouble();
        } while (u < 0);

        double v;
        do {
            System.out.print("Enter final velocity (v): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                scanner.next();
            }
            v = scanner.nextDouble();
        } while (v < 0);

        double t;
        do {
            System.out.print("Enter time (t): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                scanner.next();
            }
            t = scanner.nextDouble();
        } while (t < 0);

        double a;
        do {
            System.out.print("Enter acceleration (a): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                scanner.next();
            }
            a = scanner.nextDouble();
        } while (a < 0);

        double displacement = u * t + 0.5 * a * t * t;
        System.out.println("Displacement is: " + displacement);

        scanner.close();
    }
}
