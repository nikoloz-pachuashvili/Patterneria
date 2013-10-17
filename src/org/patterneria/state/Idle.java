package org.patterneria.state;

/**
 * Idle state of phone
 */
public class Idle implements PhoneState {

    Phone phone;

    /**
     * Initializes instance of Idle state
     *
     * @param phone
     *           instance of context
     */
    public Idle(Phone phone){
        this.phone = phone;
    }

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial() {
        System.out.println("Dialing, Setting phone state to \"Dialing\"");
        this.phone.setState(new Dialing(this.phone));
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall() {
        System.out.println("Unable to end call, Phone state is idle.");
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer() {
        System.out.println("Unable to answer call, there is no incoming call.");
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore() {
        System.out.println("Unable to ignore call, there is no incoming call.");
    }
}
