package cars;

import beepers.Beeper;
import capacities.Capacity;
import engines.Engine;

public abstract class Car {
    public Beeper beeper;
    public Engine engine;
    public Capacity capacity;


    public Car(Beeper beeper, Engine engine, Capacity capacity){
        this.beeper = beeper;
        this.engine = engine;
        this.capacity = capacity;
    }
}
