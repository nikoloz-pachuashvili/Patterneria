package org.patterneria.bridge;

/**
 * Black and white photographic film
 */
public class BWFilm implements LightSensitiveMedium {

    @Override
    public void recordLight() {
        System.out.println("Recording light on BW film");
    }
}
