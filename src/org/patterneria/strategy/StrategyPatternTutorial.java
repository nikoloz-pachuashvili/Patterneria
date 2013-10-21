package org.patterneria.strategy;

/**
 * Strategy pattern tutorial (Context)
 */
public class StrategyPatternTutorial {

    StrategyPatternLearningStrategy learningStrategy;

    /**
     * Gets learning strategy
     *
     * @return learning strategy
     */
    public StrategyPatternLearningStrategy getLearningStrategy() {
        return learningStrategy;
    }

    /**
     * Sets learning strategy
     *
     * @param learningStrategy
     */
    public void setLearningStrategy(StrategyPatternLearningStrategy learningStrategy) {
        this.learningStrategy = learningStrategy;
    }

    /**
     * Apply tutorial
     */
    public void apply(){
        this.learningStrategy.learn();
    }
}
