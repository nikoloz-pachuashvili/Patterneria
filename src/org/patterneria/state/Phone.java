package org.patterneria.state;

/**
 * Phone (context)
 */
public class Phone {

    PhoneState state = new Idle();

    /**
     * Gets state of phone
     *
     * @return The state of phone
     */
    public PhoneState getState() {
        return this.state;
    }

    /**
     * Sets state of phone
     *
     * @param state
     *          The state of phone
     */
    public void setState(PhoneState state) {
        this.state = state;
    }

    /**
     * Dial
     */
    public void dial() {
        this.state.dial(this);
    }

    /**
     * End call
     */
    public void endCall() {
        this.state.endCall(this);
    }

    /**
     * Accept call
     */
    public void answer() {
        this.state.answer(this);
    }

    /**
     * Ignore call
     */
    public void ignore() {
        this.state.ignore(this);
    }
}
