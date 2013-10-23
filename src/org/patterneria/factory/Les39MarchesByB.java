package org.patterneria.factory;

/**
 * Les 39 Marches (John Buchan's "The 39 Steps") (Concrete product)
 */
public class Les39MarchesByB implements Spectacle {

    /**
     * Perform the spectacle
     */
    @Override
    public void perform() {
        System.out.println(String.format("Performing \"Les 39 Marches\" directed by \"B\""));
    }
}
