package org.patterneria.factory;

/**
 * John buchan's "The 39 steps"  (Concrete product)
 */
public class The39StepsByA implements Spectacle {

    /**
     * Perform the spectacle
     */
    @Override
    public void perform() {
        System.out.println("Performing \"The 39 steps\" directed by \"A\"");
    }
}
