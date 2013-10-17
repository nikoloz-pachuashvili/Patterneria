package org.patterneria.state;

/**
 * Abstract interface phone state
 * Defines general phone operations
 */
public interface PhoneState {

    /**
     * Used to make call
     */
    public void dial();

    /**
     * Used to end call
     */
    public void endCall();

    /**
     * Used to accept call
     */
    public void answer();

    /**
     * Used to ignore call
     */
    public void ignore();
}
