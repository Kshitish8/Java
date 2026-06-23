public class Main {
    public static void main(String[] args) {
        System.out.println("Sum is " + add(5, 6));
        System.out.println("Sum is " + add(3, 4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}