package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(callSuper=true)


public class Tram extends Transport {
    private int seating;

    public Tram(int id, int maxSpeed, int seating,int maxQuantityOfPassengers ) {
        super(id, maxSpeed,maxQuantityOfPassengers );
        this.seating = seating;
    }

    @Override
    public void accelerate(int speed) {

    }
}
