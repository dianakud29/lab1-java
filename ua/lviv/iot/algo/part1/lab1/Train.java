package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(callSuper=true)

public class Train extends Transport {
    private int carriage;

    public Train(int id, int maxSpeed, int carriage, int maxQuantityOfPassengers) {
        super(id, maxSpeed, maxQuantityOfPassengers);
        this.carriage = carriage;
    }

    @Override
    public void accelerate(int speed) {

    }
}
