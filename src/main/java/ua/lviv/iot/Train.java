package ua.lviv.iot;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(callSuper=true)

public class Train extends Transport {
    private int carriage;

    public Train(String name, int id, int maxSpeed, int carriage, int maxQuantityOfPassengers) {
        super(name, id, maxSpeed, maxQuantityOfPassengers);
        this.carriage = carriage;
    }

    @Override
    public void accelerate(int speed) {}

    public String getHeaders(){
        return HEADER + ", carriage";
    }

    public String toCSV() {
        return super.toCSV() + "," + carriage;
    }

}
