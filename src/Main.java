import OOPSIE.Circle;
import OOPSIE.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        rect.Draw();
        rect.Area();

        Circle circle = new Circle(5);
        circle.Draw();
        circle.Area();
    }
}