import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        short age = scanner.nextShort();
        System.out.println("Your age is " + age);
    }
}