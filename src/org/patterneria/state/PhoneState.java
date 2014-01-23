package org.patterneria.state;

/**
 * Abstract interface phone state
 * Defines general phone operations
 */
public interface PhoneState {

    /**
     * Used to make call
     *
     * @param phone context
     */
    public void dial(Phone phone);

    /**
     * Used to end call
     *
     * @param phone context
     */
    public void endCall(Phone phone);

    /**
     * Used to accept call
     *
     * @param phone context
     */
    public void answer(Phone phone);

    /**
     * Used to ignore call
     *
     * @param phone context
     */
    public void ignore(Phone phone);
}
