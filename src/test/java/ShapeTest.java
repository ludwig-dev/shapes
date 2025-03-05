
import org.example.Circle;
import org.example.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @org.junit.Test
    @Test
    public void testCircleArea(){
        Shape circle = new Circle("Red", 5.0);
        assertEquals(78.54, circle.area(), 0.01);
    }
}
