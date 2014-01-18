package org.patterneria.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Metro Line
 *
 * Represents the container of metro stations (Iterable)
 */
public class MetroLine implements Iterable<Station> {

    private String name;
    private Stop firstStop;
    private Stop lastStop;

    public String getName() {
        return this.name;
    }

    public MetroLine(String name, String firstStation) {
        this(name, new Station(firstStation));
    }

    public MetroLine(String name, Station firstStation) {
        this.name = name;
        this.firstStop = new Stop(firstStation);
        this.lastStop = this.firstStop;
    }

    public MetroLine withNextStation(String stationName) {
        return withNextStation(new Station(stationName));
    }

    public MetroLine withNextStation(Station station) {
        Stop stop = new Stop(station);
        this.lastStop.setNextStop(stop);
        this.lastStop = stop;

        return this;
    }

    public Iterator<Station> iterator() {
        return new ForwardIterator();
    }

    public Iterator<Station> backwardIterator() {
        return new BackwardIterator();
    }

    private static class Stop {
        private Station station;
        private Stop previousStop;
        private Stop nextStop;

        public Station getStation() {
            return this.station;
        }

        public Stop getNextStop() {
            return this.nextStop;
        }

        public void setNextStop(Stop nextStop) {
            this.nextStop = nextStop;
            this.nextStop.previousStop = this;
        }

        public Stop getPreviousStop() {
            return this.previousStop;
        }

        public Stop(Station name) {
            this.station = name;
        }
    }

    private class ForwardIterator implements Iterator<Station> {
        private Stop current;

        public ForwardIterator() {
            this.current = firstStop;
        }

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public Station next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Station next = this.current.getStation();
            this.current = current.getNextStop();

            return next;
        }

        @Override
        public void remove() {

        }
    }

    private class BackwardIterator implements Iterator<Station> {
        private Stop current;

        public BackwardIterator() {
            current = lastStop;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Station next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Station next = current.station;
            this.current = current.getPreviousStop();

            return next;
        }

        @Override
        public void remove() {

        }
    }
}
