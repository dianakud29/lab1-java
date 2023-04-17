package ua.lviv.iot;

import static org.junit.Assert.*;
        import org.junit.Test;
public class TrolleybusTest {
    @Test
    public void testAccelerate() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus.accelerate(30);
        assertEquals(30, trolleybus.getMaxSpeed());
        trolleybus.accelerate(70);
        assertEquals(50, trolleybus.getMaxSpeed());
    }

    @Test
    public void testStop() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus.stop();
        assertEquals(0, trolleybus.getMaxSpeed());
    }

    @Test
    public void testStart() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus.start();
        assertEquals(20, trolleybus.getMaxSpeed());
    }

    @Test
    public void testAddPassenger() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus.addPassenger();
        assertEquals(1, trolleybus.getPassengers());
        trolleybus.addPassenger();
        assertEquals(2, trolleybus.getPassengers());
        for (int i = 0; i < 25; i++) {
            trolleybus.addPassenger();
        }
        assertEquals(27, trolleybus.getPassengers());
    }

    @Test
    public void testRemovePassenger() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus.removePassenger();
        assertEquals(0, trolleybus.getPassengers());
        trolleybus.addPassenger();
        trolleybus.addPassenger();
        trolleybus.removePassenger();
        assertEquals(1, trolleybus.getPassengers());
    }
    @Test
    public void testToString() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        String expected = "Trolleybus(super=Transport(id=6, maxSpeed=50, maxQuantityOfPassengers=50), routeNumber=40, currentStop=Naukova, capacity=27, passengers=0)";
        assertEquals(expected, trolleybus.toString());
    }

    @Test
    public void testConstructor() {
        Trolleybus trolleybus = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        assertEquals(40, trolleybus.getRouteNumber());
        assertEquals("Naukova", trolleybus.getCurrentStop());
        assertEquals(27, trolleybus.getCapacity());
        assertEquals(0, trolleybus.getPassengers());
        assertEquals(50, trolleybus.getMaxQuantityOfPassengers());
        assertEquals(6, trolleybus.getId());
        assertEquals(50, trolleybus.getMaxSpeed());
    }
}
