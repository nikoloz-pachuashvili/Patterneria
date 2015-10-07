package org.patterneria;

import org.patterneria.bridge.BridgeSample;
import org.patterneria.iterator.IteratorSample;
import org.patterneria.iterator.MetroLine;
import org.patterneria.state.StateSample;
import org.patterneria.strategy.StrategySample;
import org.patterneria.visitor.VisitorSample;

import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello patterneria");

        System.out.println("Strategy Pattern sample:");
        new StrategySample().run();

        System.out.println("State Pattern sample:");
        new StateSample().run();

        System.out.println("Iterator pattern sample");
        new IteratorSample().run();

        System.out.println("Visitor pattern sample");
        new VisitorSample().run();

        System.out.println("Bridge pattern sample");
        new BridgeSample().run();
    }
}
