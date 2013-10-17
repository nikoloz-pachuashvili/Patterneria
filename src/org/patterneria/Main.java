package org.patterneria;

import org.patterneria.state.StateSample;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello patterneria");

        StateSample state = new StateSample();
        state.run();

    }
}
