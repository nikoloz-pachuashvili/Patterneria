package org.patterneria.strategy;

/**
 * Strategy pattern by Gang of Four
 */
public class StrategyPatternByGOF implements StrategyPatternLearningStrategy {

    /**
     * Learn strategy pattern from GOF
     */
    @Override
    public void learn() {
        System.out.println("***************************************************************************************");
        System.out.println("Learn strategy pattern applying \"Design Patterns Elements of Reusable Object-Oriented Software\". p. 315-323");
        System.out.println("Intent:");
        System.out.println("\tDefine a family of algorithms, encapsulate each one, and make them interchangeable.");
        System.out.println("\tStrategy lets the algorithm vary independently from clients that use it.");
        System.out.println("***************************************************************************************");
    }
}
