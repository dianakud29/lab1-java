package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TransportManagerTest {
    private TransportManager transportManager;
    private Transport tram1;
    private Transport tram2;
    private Transport train1;
    private Transport train2;
    private Transport trolleybus1;
    private Transport trolleybus2;
    private Transport car1;
    private Transport car2;

    @BeforeEach
    void setUp() {
        transportManager = new TransportManager();

        tram1 = new Tram(45, 35, 25, 50);
        tram2 = new Tram(56, 95, 17, 45);
        train1 = new Train(19, 80, 6, 100);
        train2 = new Train(34, 70, 5, 80);
        trolleybus1 = new Trolleybus(40, "Naukova", 27, 0, 50, 6, 50);
        trolleybus2 = new Trolleybus(2, "Stryyska", 30, 15, 42, 5, 50);
        car1 = new Car(4, 4,500, 230, 200, 5);
        car2 = new Car(8, 8,600, 260, 65, 8);
    }

    @Test
    void testAddTransport() {
        transportManager.addTransport(tram1);
        List<Transport> transports = transportManager.transports;
        assertEquals(1, transports.size());
        assertTrue(transports.contains(tram1));
    }

    @Test
    void testFindAllWithSpeedGreaterThan() {
        transportManager.addTransport(tram1);
        transportManager.addTransport(tram2);
        transportManager.addTransport(train1);
        transportManager.addTransport(train2);
        transportManager.addTransport(trolleybus1);
        transportManager.addTransport(trolleybus2);
        transportManager.addTransport(car1);
        transportManager.addTransport(car2);

        List<Transport> result = transportManager.findAllWithSpeedGreaterThan(60);

        assertEquals(5, result.size());
        assertTrue(result.contains(tram2));
        assertFalse(result.contains(trolleybus1));
        assertTrue(result.contains(car1));
        assertTrue(result.contains(car2));
        assertFalse(result.contains(trolleybus2));
        assertFalse(result.contains(tram1));
        assertTrue(result.contains(train1));
        assertTrue(result.contains(train2));
    }

    @Test
    void testFindAllWithQuantityOfPassengersGreaterThan() {
        transportManager.addTransport(tram1);
        transportManager.addTransport(tram2);
        transportManager.addTransport(train1);
        transportManager.addTransport(train2);
        transportManager.addTransport(trolleybus1);
        transportManager.addTransport(trolleybus2);
        transportManager.addTransport(car1);
        transportManager.addTransport(car2);

        List<Transport> result = transportManager.findAllWithQuantityOfPassengersGreaterThan(30);

        assertEquals(6, result.size());
        assertTrue(result.contains(tram1));
        assertTrue(result.contains(tram2));
        assertTrue(result.contains(trolleybus1));
        assertFalse(result.contains(car2));
        assertTrue(result.contains(trolleybus2));
        assertFalse(result.contains(car1));
        assertTrue(result.contains(train1));
        assertTrue(result.contains(train2));

    }
}

