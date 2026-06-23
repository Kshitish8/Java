package OOPSIE;

import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give input for the first number:");
        int x = sc.nextInt();
        System.out.println("Give input for the second number:");
        int y = sc.nextInt();
        Encapsulation obj = new Encapsulation();
        obj.add(x, y);
        sc.close();
    }

    public void add(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }
}
