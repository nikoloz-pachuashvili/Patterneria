package org.patterneria;

import org.patterneria.state.StateSample;
import org.patterneria.strategy.StrategySample;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello patterneria");

        System.out.println("Strategy Pattern sample:");

        StrategySample strategy = new StrategySample();
        strategy.run();

        System.out.println("State Pattern sample:");

        StateSample state = new StateSample();
        state.run();

    }
}
