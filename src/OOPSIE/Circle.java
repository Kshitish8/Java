package OOPSIE;

public class Circle implements Shape {

    // 1. REMOVED 'static'. Now each circle object gets its own radius.
    private int radius; 

    public Circle(int radius) {
        // 2. Changed 'Circle.radius' to 'this.radius' to correctly refer to the instance variable
        this.radius = radius; 
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
