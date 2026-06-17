package OOPSIE;

public class Circle implements Shape {

    private static int radius;

    public Circle(int radius) {
        Circle.radius = radius;
    }

    @Override
    public void Draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void Area() {
        int area = (int) (Math.PI * radius * radius);
        System.out.println("Area of circle is: " + area);
    }
}
