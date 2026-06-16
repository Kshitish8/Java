package oops;

public class Circle {

    private static int radius;

    public Circle(int radius) {
        Circle.radius = radius;
    }

    public static void Draw() {
        System.out.println("Drawing a circle");
    }

    public static void Area() {
        int area = (int) (Math.PI * radius * radius);
        System.out.println("Area of circle is: " + area);
    }
}
