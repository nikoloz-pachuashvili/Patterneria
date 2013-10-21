package org.patterneria.strategy;

/**
 * Learn strategy pattern using several examples (Concrete Strategy)
 */
public class StrategyPatternByExamples implements StrategyPatternLearningStrategy {

    /**
     * Apply strategy
     */
    @Override
    public void learn() {

        System.out.println("********************************************************************************");
        System.out.println("Discuss square root finding problem.");
        System.out.println("Note that there several ways (algorithms) to find square root:");
        System.out.println("Bisection Method, Guess and Check Method, Method of Simple Iteration...");
        System.out.println("Define Context (Equation), Abstract Strategy (Equation solving algorithm) and");
        System.out.println("Implement Concrete Strategies (Bisection, Guess and Check, Simple Iteration)...");
        System.out.println("Find and discuss several examples of strategy pattern implementation.");
        System.out.println("See examples: \n\thttp://www.dofactory.com/Patterns/PatternStrategy.aspx");
        System.out.println("\thttp://www.programcreek.com/2011/01/a-java-example-of-strategy-design-pattern/");
        System.out.println("\thttp://www.oodesign.com/strategy-pattern.html");
        System.out.println("********************************************************************************");
    }
}
