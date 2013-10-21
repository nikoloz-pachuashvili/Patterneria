package org.patterneria.strategy;

/**
 * Learn strategy pattern applying "Head First Design Patterns" Concrete strategy
 */
public class StrategyByHeadFirst implements StrategyPatternLearningStrategy {

    /**
     * Learn strategy pattern from "Head First Design Patterns"
     */
    @Override
    public void learn() {
        System.out.println("***************************************************************************************");
        System.out.println("Learn strategy pattern applying \"Head First Design Patterns\" p. 10 - 28");
        System.out.println("Read real good examples about ducks and duck behaviors...");
        System.out.println("\t\"We're using the strategy pattern to implement the various behaviors of our ducks.\"");
        System.out.println("\tThis tells you the duck behavior has been encapsulated into its own set of classes\n");
        System.out.println("\tthat can be easily expanded and changed, even at runtime if needed");
        System.out.println("***************************************************************************************");
    }
}
