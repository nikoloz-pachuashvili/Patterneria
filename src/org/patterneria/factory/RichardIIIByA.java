package org.patterneria.factory;

/**
 * Richard III Directed by "A" (Concrete product)
 */
public class RichardIIIByA implements Spectacle {

    /**
     * Perform spectacle
     */
    @Override
    public void perform() {
        System.out.println("Performing \"Richard III\" directed by \"A\"");
    }
}
