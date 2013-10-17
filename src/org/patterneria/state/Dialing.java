package org.patterneria.state;

/**
 * Dialing state of phone
 */
public class Dialing implements PhoneState {

    Phone phone;

    /**
     * Initializes instance of Dialing state
     *
     * @param phone
     *          instance of context
     */
    public Dialing(Phone phone) {
        this.phone = phone;
    }

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial() {
        System.out.println("Unable to dial, already dialing");
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall() {
        System.out.println("Ending call, Setting phone state to \"Idle\"");
        this.phone.setState(new Idle(this.phone));
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer() {
        System.out.println("Unable to answer call, already dialing.");
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore() {
        System.out.println("Unable to ignore call, already dialing.");
    }
}
