package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trolleybus {
    private int id = 100;
    private int routeNumber;
    private String currentStop;
    private int maxSpeed;
    private int capacity;
    private int passengers;

    private static Trolleybus instance;

    public static Trolleybus getInstance() {
        if (instance == null) {
            instance = new Trolleybus();
        }
        return instance;
    }

    public Trolleybus(int routeNumber, String currentStop, int maxSpeed, int capacity) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.passengers = 0;
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

    public static void main(String[] args) {
        Trolleybus[] trolleybuses = {
                new Trolleybus(),
                new Trolleybus(100, 126, "Naukova", 50, 25, 10),
                Trolleybus.getInstance(),
                Trolleybus.getInstance()};

        for (Trolleybus trolleybus : trolleybuses) {
            System.out.println(trolleybus);
        }
    }

}

