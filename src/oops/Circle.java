package oops;

public class Circle extends Shape {

    private static int radius;

    public Circle(int radius) {
        Circle.radius = radius;
    }

    /*
     * public void Draw() {
     * System.out.println("Drawing a circle");
     * }
     */

    @Override
    public void Area() {
        int area = (int) (Math.PI * radius * radius);
        System.out.println("Area of circle is: " + area);
    }
}
