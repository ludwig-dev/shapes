
import org.example.Circle;
import org.example.Rectangle;
import org.example.Shape;
import org.example.Square;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @org.junit.Test
    public void testCircleArea(){
        Shape circle = new Circle("Red", 5.0);
        assertEquals(78.54, circle.area(), 0.01);
    }

    @org.junit.Test
    public void testRectangleArea() {
        Shape rectangle = new Rectangle("Red", 3.0,6.0);
        assertEquals(18.0, rectangle.area());
    }

    @org.junit.Test
    public void testSquareArea() {
        Shape square = new Square("Red", 4.0);
        assertEquals(16.0, square.area());
    }
}
