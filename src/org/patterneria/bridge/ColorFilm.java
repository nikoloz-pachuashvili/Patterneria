package org.patterneria.bridge;

/**
 * Color photographic film
 */
public class ColorFilm implements LightSensitiveMedium {

    @Override
    public void recordLight() {
        System.out.println("Recording light on color film");
    }
}
