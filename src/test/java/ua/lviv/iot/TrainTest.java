package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrainTest {

    @Test
    public void testConstructor() {
        Train train = new Train("Train", 19, 80, 6, 100);
        assertEquals(19, train.getId());
        assertEquals(80, train.getMaxSpeed());
        assertEquals(6, train.getCarriage());
        assertEquals(100, train.getMaxQuantityOfPassengers());
    }

    @Test
    public void testToString() {
        Train train = new Train("Train", 19, 80, 6, 100);
        String expected = "Train(super=Transport(id=19, maxSpeed=80, maxQuantityOfPassengers=100), carriage=6)";
        assertEquals(expected, train.toString());
    }

    @Test
    public void testAccelerate() {
        Train train = new Train("Train", 1, 120, 10, 500);
        train.accelerate(10);
        assertEquals(120, train.getMaxSpeed());
    }
}
