package org.patterneria.state;

/**
 * Incoming call state of phone
 */
public class IncomingCall implements PhoneState {

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial(Phone phone) {
        System.out.println("Unable to dial, there is incoming call.");
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall(Phone phone) {
        System.out.println("Unable to end call, there is incoming call.");
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer(Phone phone) {
        System.out.println("Answering call. Setting phone state to \"Dialing\"");
        phone.setState(new Dialing());
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore(Phone phone) {
        System.out.println("Ignoring call. Setting phone state to \"Idle\"");
        phone.setState(new Idle());
    }
}