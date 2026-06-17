import OOPSIE.Circle;
import OOPSIE.Rectangle;
import java.awt.Shape;

public class Main {

    public static void main(String[] args) {
        Shape shape0= new Circle(8);
        Shape.Draw();
        Shape.Area();

        Shape shape1 = new Rectangle(4)(5);
        Shape.Draw();
        Shape.Area();
    }
}