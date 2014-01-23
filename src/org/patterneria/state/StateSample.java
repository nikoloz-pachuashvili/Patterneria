package org.patterneria.state;

/**
 * State sample
 */
public class StateSample {

    public void run(){

        Phone phone = new Phone();

        phone.dial();
        phone.endCall();

        phone.setState(new IncomingCall());

        phone.ignore();
        phone.dial();
        phone.answer();
        phone.endCall();
    }
}
