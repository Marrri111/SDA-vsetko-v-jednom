package excercise.taskN;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void testGetPerimeter() {
        Circle circle = new Circle();
        Assertions.assertEquals(2 * Math.PI * 1, circle.getPerimeter());
    }

    @Test
    void resize() {
        Circle circle = new Circle();
        assertEquals(1, circle.getRadius());
        circle.resize(200);
        assertEquals(2, circle.getRadius());
    }
}