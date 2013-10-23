package org.patterneria.factory;

/**
 * "An Inspector Calls is a play written by English dramatist J. B. Priestley"
 * "An Inspector Calls" directed by "A" (Concrete product)
 */
public class AnInspectorCallsByA implements Spectacle {

    /**
     * Perform spectacle
     */
    @Override
    public void perform() {
        System.out.println("Performing \"An Inspector Calls\" directed by \"A\"");
    }
}
