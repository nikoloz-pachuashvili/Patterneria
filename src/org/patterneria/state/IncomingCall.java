package org.patterneria.state;

/**
 * Incoming call state of phone
 */
public class IncomingCall implements PhoneState {

    Phone phone;

    /**
     * Initializes instance of IncomingCall state
     *
     * @param phone
     *           instance of context
     */
    public IncomingCall(Phone phone) {
        this.phone = phone;
    }

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial() {
        System.out.println("Unable to dial, there is incoming call.");
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall() {
        System.out.println("Unable to end call, there is incoming call.");
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer() {
        System.out.println("Answering call. Setting phone state to \"Dialing\"");
        this.phone.setState(new Dialing(this.phone));
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore() {
        System.out.println("Ignoring call. Setting phone state to \"Idle\"");
        this.phone.setState(new Idle(this.phone));
    }
}