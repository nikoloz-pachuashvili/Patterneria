package org.patterneria.bridge;

/**
 * Digital image sensor, concrete implementation of light-sensitive medium.
 */
public class DigitalImageSensor implements LightSensitiveMedium {

    /**
     * Records light using digital sensor.
     */
    @Override
    public void recordLight() {
        System.out.println("Recording light digitally");
    }
}
