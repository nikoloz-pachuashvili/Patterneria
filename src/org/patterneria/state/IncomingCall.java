package org.patterneria.state;

/**
 * Incoming call state of phone
 */
public class IncomingCall implements PhoneState {

    Phone phone;

    public IncomingCall(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void dial() {
        System.out.println("Unable to dial, there is incoming call.");
    }

    @Override
    public void endCall() {
        System.out.println("Unable to end call, there is incoming call.");
    }

    @Override
    public void answer() {
        System.out.println("Answering call. Setting phone state to \"Dialing\"");
        this.phone.setState(new Dialing(this.phone));
    }

    @Override
    public void ignore() {
        System.out.println("Ignoring call. Setting phone state to \"Idle\"");
        this.phone.setState(new Idle(this.phone));
    }
}