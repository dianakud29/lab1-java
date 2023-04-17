package ua.lviv.iot;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(callSuper=true)


public class Tram extends Transport {
    private int seating;

    public Tram(String name, int id, int maxSpeed, int seating,int maxQuantityOfPassengers ) {
        super(name, id, maxSpeed,maxQuantityOfPassengers );
        this.seating = seating;
    }

    @Override
    public void accelerate(int speed) {}


    public String getHeaders(){
        return HEADER + ", seating";
    }

    public String toCSV() {
        return super.toCSV() + "," + seating;
    }

}
