package org.patterneria.state;

/**
 * Idle state of phone
 */
public class Idle implements PhoneState {

    /**
     * "Dial" operation implementation
     */
    @Override
    public void dial(Phone phone) {
        System.out.println("Dialing, Setting phone state to \"Dialing\"");
        phone.setState(new Dialing());
    }

    /**
     * "End call" operation implementation
     */
    @Override
    public void endCall(Phone phone) {
        System.out.println("Unable to end call, Phone state is idle.");
    }

    /**
     * "Answer" operation implementation
     */
    @Override
    public void answer(Phone phone) {
        System.out.println("Unable to answer call, there is no incoming call.");
    }

    /**
     * "Ignore" operation implementation
     */
    @Override
    public void ignore(Phone phone) {
        System.out.println("Unable to ignore call, there is no incoming call.");
    }
}
