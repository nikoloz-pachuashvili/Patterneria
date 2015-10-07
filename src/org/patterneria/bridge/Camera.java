package org.patterneria.bridge;

/**
 * Abstract photographic camera
 */
public abstract class Camera {

    private LightSensitiveMedium lightRecorder;

    public LightSensitiveMedium getLightRecorder() {
        return lightRecorder;
    }

    public void setLightRecorder(LightSensitiveMedium lightRecorder) {
        this.lightRecorder = lightRecorder;
    }

    protected void recordLight(){
        this.lightRecorder.recordLight();
    }

    public void captureImage(){
        System.out.println("Open shutter");
        recordLight();
        System.out.println("Close shutter");
    }
}
