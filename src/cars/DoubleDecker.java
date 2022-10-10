package cars;

import beepers.Beeper;
import capacities.Capacity;
import cars.Car;
import engines.Engine;

public class DoubleDecker extends Car {
    public DoubleDecker(Beeper beeper, Engine engine, Capacity capacity) {
        super(beeper, engine, capacity);
    }
    public String payForTravel(){
        return "ЗА ПРОЕЗД ПЕРЕДАЁМ, МОЛОДЫЕ ЛЮДИ!!!";
    }
}
