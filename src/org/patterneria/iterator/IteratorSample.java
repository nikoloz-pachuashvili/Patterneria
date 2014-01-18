package org.patterneria.iterator;

/**
 * Iterator sample
 */
public class IteratorSample {

    /**
     * Runs sample
     */
    public void run(){

        MetroLine piccadilly = new MetroLine("Piccadilly", new Station("Cockfosters"))
                .withNextStation("Oakwood")
                .withNextStation("Southgate")
                .withNextStation("Arnos Grove")
                .withNextStation("Bounds Green")
                .withNextStation("Wood Green")
                .withNextStation("Turnpike Lane")
                .withNextStation("Manor House")
                .withNextStation("Finsbury Park")
                .withNextStation("Arsenal")
                .withNextStation("Holloway Road")
                .withNextStation("Caledonian Road")
                .withNextStation("King's Cross St. Pancras")
                .withNextStation("Russell Square")
                .withNextStation(new Station("Holborn", "Mind the gap"))
                .withNextStation("Covent Garden")
                .withNextStation("Leicester Square")
                .withNextStation("Piccadilly Circus")
                .withNextStation("Green Park")
                .withNextStation("Hyde Park Corner")
                .withNextStation("Knightsbridge")
                .withNextStation("South Kensington")
                .withNextStation("Glocester Road")
                .withNextStation("Earl's Court");

        Train train = new Train();

        System.out.println("This is Piccadilly line service to cockfosters...");

        train.go(piccadilly.iterator());
        train.go(piccadilly.backwardIterator());
    }
}
