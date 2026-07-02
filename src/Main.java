public class Main {

    // The main method is the entry point required to run your code
    public static void main(String[] args) {
        // Example: Testing your overloaded add methods
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
    }

    // First add method (inside the class)
    public static int add(int a, int b) {
        return a + b;
    }

    // Second add method (inside the class)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}