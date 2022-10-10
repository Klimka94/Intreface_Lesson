package cars;

import beepers.Beeper;
import capacities.Capacity;
import engines.Engine;

public class Opel extends Car {
    public Opel(Beeper beeper, Engine engine, Capacity capacity) {
        super(beeper, engine, capacity);
    }
    public String isNotBoiled() {
        return "Ура, победа!";
    }
}
