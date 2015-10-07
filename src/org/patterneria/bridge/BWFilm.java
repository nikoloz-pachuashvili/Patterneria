package org.patterneria.bridge;

/**
 * Black and white photographic film, concrete implementation of light-sensitive medium.
 */
public class BWFilm implements LightSensitiveMedium {

    @Override
    public void recordLight() {
        System.out.println("Recording light on BW film");
    }
}
