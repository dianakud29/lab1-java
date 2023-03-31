package ua.lviv.iot.algo.part1.lab2;

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
    protected int id = 0;
    protected int maxSpeed;
    protected int maxQuantityOfPassengers;

    public abstract void accelerate(int speed);
}

