import oops.Circle;
import oops.Rectangle;
import oops.Shape;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        rect.Draw();
        rect.Area();

        Shape shape = new Circle(5);
        shape.Draw();
        shape.Area();
    }
}