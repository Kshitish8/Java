package OOPSIE;

public class Rectangle extends Shape {

    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    static {
        System.out.println("I am in side the constructor");
    }

    @Override
    public void Draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void Area() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}
