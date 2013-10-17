package org.patterneria.state;

/**
 * Phone (context)
 */
public class Phone {

    PhoneState state = new Idle(this);

    public PhoneState getState() {
        return this.state;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void dial() {
        this.state.dial();
    }

    public void endCall() {
        this.state.endCall();
    }

    public void answer() {
        this.state.answer();
    }

    public void ignore() {
        this.state.ignore();
    }
}
