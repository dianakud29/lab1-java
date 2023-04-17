package ua.lviv.iot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper=true)
class Car extends Transport {
    private int numberOfDoors;
    private int trunkVolume;
    private int maxLoad;
    public Car(String name, int id, int numberOfDoors, int trunkVolume, int maxLoad, int maxSpeed, int maxQuantityOfPassengers) {
        super(name, id, maxSpeed, maxQuantityOfPassengers);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolume = trunkVolume;
        this.maxLoad = maxLoad;

    }

    @Override
    public void accelerate(int speed) {
        setMaxSpeed(Math.min(speed, 200));
    }


    public String getHeaders() {
        return HEADER + ", numberOfDoors" + ", trunkVolume" + ", maxLoad";
    }

    public String toCSV() {
        return super.toCSV() + "," + numberOfDoors + "," + trunkVolume + "," + maxLoad;
    }
}
