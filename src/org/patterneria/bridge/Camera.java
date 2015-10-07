package org.patterneria.bridge;

/**
 * Abstract photographic camera
 */
public abstract class Camera {

    /**
     * Light-sensitive medium (Abstract implementer)
     */
    private LightSensitiveMedium lightRecorder;

    /**
     * Gets light recorder
     * @return light recorder
     */
    public LightSensitiveMedium getLightRecorder() {
        return lightRecorder;
    }

    /**
     * Sets light recorder
     * @param lightRecorder The light recorder
     */
    public void setLightRecorder(LightSensitiveMedium lightRecorder) {
        this.lightRecorder = lightRecorder;
    }

    /**
     * Records light using light recorder
     */
    protected void recordLight(){
        this.lightRecorder.recordLight();
    }

    /**
     * Captures image
     */
    public void captureImage(){
        System.out.println("Open shutter");
        recordLight();
        System.out.println("Close shutter");
    }
}
