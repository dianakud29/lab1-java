package ua.lviv.iot;

import org.junit.Test;
import static org.junit.Assert.*;

public class TramTest {

    @Test
    public void testConstructor() {
        Tram tram = new Tram("Tram", 45, 35, 25, 50);
        assertEquals(45, tram.getId());
        assertEquals(35, tram.getMaxSpeed());
        assertEquals(25, tram.getSeating());
        assertEquals(50, tram.getMaxQuantityOfPassengers());
    }

    @Test
    public void testToString() {
        Tram tram = new Tram("Tram", 45, 35, 25, 50);
        String expected = "Tram(super=Transport(id=45, maxSpeed=35, maxQuantityOfPassengers=50), seating=25)";
        assertEquals(expected, tram.toString());
    }

    @Test
    public void testAccelerate() {
        Tram tram = new Tram("Tram", 45, 35, 25, 50);
        tram.accelerate(5);
        assertEquals(35, tram.getMaxSpeed());
    }
    @Test
    public void testTramInheritance() {
        Tram tram = new Tram("Tram", 45, 35, 25, 50);
        assertEquals(45, tram.getId());
        assertEquals(35, tram.getMaxSpeed());
        assertEquals(50, tram.getMaxQuantityOfPassengers());
    }

}