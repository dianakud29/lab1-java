package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper=true)

class Trolleybus extends Transport {
    private int routeNumber;
    private String currentStop;
    private int capacity;
    private int passengers;

    public Trolleybus(int routeNumber, String currentStop, int capacity, int passengers, int maxQuantityOfPassengers, int id, int maxSpeed) {
        super(id, maxQuantityOfPassengers, maxSpeed);
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.capacity = capacity;
        this.passengers = 0;
    }

    @Override
    public void accelerate(int speed) {
        setMaxSpeed(Math.min(speed, 50));
    }

    public void stop() {
        setMaxSpeed(0);
    }

    public void start() {
        setMaxSpeed(20);
    }

    public void addPassenger() {
        if (passengers < capacity) {
            passengers++;
        }
    }

    public void removePassenger() {
        if (passengers > 0) {
            passengers--;
        }
    }
}

