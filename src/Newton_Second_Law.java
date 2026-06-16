import java.util.Scanner;

public class Newton_Second_Law {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial velocity (u): ");
        double u = scanner.nextDouble();
        System.out.print("Enter final velocity (v): ");
        double v = scanner.nextDouble();
        System.out.print("Enter time (t): ");
        double t = scanner.nextDouble();
        System.out.print("Enter acceleration (a): ");
        double a = scanner.nextDouble();
        double displacement = u * t + 0.5 * a * t * t;
        System.out.println("Displacement is: " + displacement);
    }
}