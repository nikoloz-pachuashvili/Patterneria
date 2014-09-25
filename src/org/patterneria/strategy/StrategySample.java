package org.patterneria.strategy;

/**
 *  Strategy pattern sample
 */
public class StrategySample {
    public void run(){

        StrategyPatternTutorial tutorial = new StrategyPatternTutorial();

        tutorial.setLearningStrategy(new StrategyPatternByGOF());
        System.out.println("Learn strategy pattern by \"GOF\":");
        tutorial.apply();

        tutorial.setLearningStrategy(new StrategyByHeadFirst());
        System.out.println("Learn strategy pattern By \"Head First\":");
        tutorial.apply();

        tutorial.setLearningStrategy(new StrategyPatternByExamples());
        System.out.println("Learn strategy pattern by examples:");
        tutorial.apply();

        tutorial.setLearningStrategy(new StrategyByPatterneria());
        System.out.println("Learn strategy pattern by patterneria:");
        tutorial.apply();

        tutorial.setLearningStrategy(new StrategyWithPPTSlidesDecorator(new StrategyPatternByGOF()));
        System.out.println("Learn strategy pattern by \"GOF\" with slides:");
        tutorial.apply();

        tutorial.setLearningStrategy(new StrategyMix(new StrategyPatternByGOF(),
                new StrategyByHeadFirst(),
                new StrategyByPatterneria()));

        System.out.println("Learn strategy pattern from several sources:");
        tutorial.apply();

    }
}
