package org.patterneria.bridge;

/**
 * Color photographic film, concrete implementation of light-sensitive medium.
 */
public class ColorFilm implements LightSensitiveMedium {

    /**
     * Records light on color film
     */
    @Override
    public void recordLight() {
        System.out.println("Recording light on color film");
    }
}
