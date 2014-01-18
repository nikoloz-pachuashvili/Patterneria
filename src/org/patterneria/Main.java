package org.patterneria;

import org.patterneria.iterator.IteratorSample;
import org.patterneria.iterator.MetroLine;
import org.patterneria.state.StateSample;
import org.patterneria.strategy.StrategySample;

import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello patterneria");

        System.out.println("Strategy Pattern sample:");

        StrategySample strategy = new StrategySample();
        strategy.run();

        System.out.println("State Pattern sample:");

        StateSample state = new StateSample();
        state.run();

        System.out.println("Iterator pattern sample");

        IteratorSample iterator = new IteratorSample();

        iterator.run();

    }
}
