package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testConstructor() {
        Car car = new Car(4, 4, 500, 230, 200, 5);
        Assertions.assertEquals(4, car.getId());
        Assertions.assertEquals(4, car.getNumberOfDoors());
        Assertions.assertEquals(500, car.getTrunkVolume());
        Assertions.assertEquals(230, car.getMaxLoad());
        Assertions.assertEquals(200, car.getMaxSpeed());
        Assertions.assertEquals(5, car.getMaxQuantityOfPassengers());
    }

    @Test
    public void testAccelerate() {
        Car car = new Car(4, 4, 500, 230, 200, 5);
        car.accelerate(80);
        Assertions.assertEquals(80, car.getMaxSpeed());
        car.accelerate(300);
        Assertions.assertEquals(200, car.getMaxSpeed());
    }

}

