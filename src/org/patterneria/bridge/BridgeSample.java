package org.patterneria.bridge;

/**
 * Bridge sample
 */
public class BridgeSample {

    public void run(){
        Camera camera = new The35mmCamera();
        camera.setLightRecorder(new BWFilm());
        camera.captureImage();

        camera.setLightRecorder(new ColorFilm());
        camera.captureImage();

        camera = new MediumFormatCamera();
        camera.setLightRecorder(new DigitalImageSensor());

        camera.captureImage();

        camera = new LargeFormatCamera();
        camera.setLightRecorder(new BWFilm());
        camera.captureImage();
    }
}
