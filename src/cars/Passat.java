package cars;

import beepers.Beeper;
import capacities.Capacity;
import engines.Engine;

public class Passat extends Car{
    public Passat(Beeper beeper, Engine engine, Capacity capacity) {
        super(beeper, engine, capacity);
    }
    public String chipTuning(){
        return "Валит жесть!";
    }
}
