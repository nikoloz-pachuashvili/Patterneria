package org.patterneria.state;

/**
 * Dialing state of phone
 */
public class Dialing implements PhoneState {

    Phone phone;

    public Dialing(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void dial() {
        System.out.println("Unable to dial, already dialing");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call, Setting phone state to \"Idle\"");
        this.phone.setState(new Idle(this.phone));
    }

    @Override
    public void answer() {
        System.out.println("Unable to answer call, already dialing.");
    }

    @Override
    public void ignore() {
        System.out.println("Unable to ignore call, already dialing.");
    }
}
