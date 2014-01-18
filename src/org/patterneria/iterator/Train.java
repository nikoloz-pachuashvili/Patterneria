package org.patterneria.iterator;

import java.util.Iterator;

/**
 * Train represents the client
 */
public class Train {

    /**
     * Iterates the route
     *
     * @param route
     *          Route to traverse
     */
    public void go(Iterator<Station> route){

        while (route.hasNext()){
            stop(route.next());
        }

        System.out.println("=========================== This is a last stop ======================================");
    }

    /**
     * Stops at station
     *
     * @param station
     *             The station
     */
    private void stop(Station station){

        System.out.println("************* STOP *******************");
        System.out.println(station.getName());

        if (station.getNotification() != null){
            System.out.println("Notification: " + station.getNotification());
        }
    }
}
