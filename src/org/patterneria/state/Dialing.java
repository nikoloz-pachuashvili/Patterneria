package org.patterneria.state;

/**
 * Dialing state of phone
 */
public class Dialing implements PhoneState {

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial(Phone phone) {
        System.out.println("Unable to dial, already dialing");
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall(Phone phone) {
        System.out.println("Ending call, Setting phone state to \"Idle\"");
        phone.setState(new Idle());
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer(Phone phone) {
        System.out.println("Unable to answer call, already dialing.");
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore(Phone phone) {
        System.out.println("Unable to ignore call, already dialing.");
    }
}
