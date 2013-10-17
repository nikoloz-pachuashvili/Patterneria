package org.patterneria.state;

/**
 * Idle state of phone
 */
public class Idle implements PhoneState {

    Phone phone;

    public Idle(Phone phone){
        this.phone = phone;
    }

    @Override
    public void dial() {
        System.out.println("Dialing, Setting phone state to \"Dialing\"");
        this.phone.setState(new Dialing(this.phone));
    }

    @Override
    public void endCall() {
        System.out.println("Unable to end call, Phone state is idle.");
    }

    @Override
    public void answer() {
        System.out.println("Unable to answer call, there is no incoming call.");
    }

    @Override
    public void ignore() {
        System.out.println("Unable to ignore call, there is no incoming call.");
    }
}
