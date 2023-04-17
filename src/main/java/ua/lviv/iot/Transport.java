package ua.lviv.iot;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

abstract class Transport {
    protected String name;
    protected int id = 0;
    protected int maxSpeed;
    protected int maxQuantityOfPassengers;

    public static final String HEADER = "name, id, maxSpeed, maxQuantityOfPassengers";

    public abstract void accelerate(int speed);

    public String getHeaders() { return HEADER;}

    public String toCSV() {return name + "," + id + "," + maxSpeed + "," + maxQuantityOfPassengers;}

}

