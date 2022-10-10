import beepers.Beeper;
import beepers.Horn;
import beepers.Song;
import beepers.Sound;
import capacities.Capacity;
import capacities.busCapacity;
import capacities.opelCapacity;
import capacities.passatCapacity;
import cars.Car;
import cars.DoubleDecker;
import cars.Passat;
import engines.Engine;
import engines.EngineC16NZ;
import cars.Opel;
import engines.EngineV16;
import engines.EngineV6;

import java.util.ArrayList;

public class Main {
    public static void addDel(){
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Beeper horn = new Horn();
        Engine engineC16NZ = new EngineC16NZ();
        Capacity opelCapacity = new opelCapacity();

        Opel opel = new Opel(horn, engineC16NZ, opelCapacity);


        Beeper sound = new Sound();
        Engine engineV6 = new EngineV6();
        Capacity passatCapacity = new passatCapacity();

        Passat passat = new Passat(sound, engineV6, passatCapacity);

        Beeper song = new Song();
        Engine enginev16 = new EngineV16();
        Capacity busCapacity = new busCapacity();

        DoubleDecker doubleDecker = new DoubleDecker(song, enginev16, busCapacity);

        addDel();
        System.out.println(opel.beeper.madeSound());
        System.out.println(opel.engine.getSpeed());
        System.out.println(opel.capacity.getCapacity());
        System.out.println(opel.isNotBoiled());
        addDel();
        System.out.println(passat.beeper.madeSound());
        System.out.println(passat.engine.getSpeed());
        System.out.println(passat.capacity.getCapacity());
        System.out.println(passat.chipTuning());
        addDel();
        System.out.println(doubleDecker.beeper.madeSound());
        System.out.println(doubleDecker.engine.getSpeed());
        System.out.println(doubleDecker.capacity.getCapacity());
        System.out.println(doubleDecker.payForTravel());
        addDel();
    }
}