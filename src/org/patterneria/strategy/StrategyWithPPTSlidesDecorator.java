package org.patterneria.strategy;

/**
 * This class expands learning strategies
 * by adding ppt presentation as helper for provided
 * learning strategy using certain Design Pattern
 * (a.k.a Decorator)
 */
public class StrategyWithPPTSlidesDecorator implements StrategyPatternLearningStrategy {
	protected StrategyPatternLearningStrategy innerStrategy;
	
	public StrategyWithPPTSlidesDecorator(StrategyPatternLearningStrategy innerStrategy){
		this.innerStrategy = innerStrategy;
	}

	/**
	 * Override learn method so
	 * it'll call learn method of inner object
	 * and add some additional behavior as well
	 */
	@Override
	public void learn() {
		innerStrategy.learn();
		System.out.println("[Use provided PPT presentation to better understand the concepts]");
	}

}