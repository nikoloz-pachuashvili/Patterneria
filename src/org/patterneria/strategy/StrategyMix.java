package org.patterneria.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents mix of different learning strategies
 * using certain Design Pattern (a.k.a Composite)
 */
public class StrategyMix implements StrategyPatternLearningStrategy {
	protected List<StrategyPatternLearningStrategy> strategies;
	
	public StrategyMix(StrategyPatternLearningStrategy... strategies){
		this.strategies = Arrays.asList(strategies);
	}
	
	/**
	 * Override learn method so it'll call
	 * learn method of all provided strategies
	 * one by one
	 */
	@Override
	public void learn() {
		for (StrategyPatternLearningStrategy strategy : strategies)
			strategy.learn();
	}

}