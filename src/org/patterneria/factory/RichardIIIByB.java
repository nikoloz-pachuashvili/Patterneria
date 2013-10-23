package org.patterneria.factory;

/**
 * Richard III directed by "B" (Concrete product)
 */
public class RichardIIIByB implements Spectacle {

    /**
     * Perform spectacle
     */
    @Override
    public void perform() {
        System.out.println("Performing \"Richard III\" directed by \"B\"");
    }
}
