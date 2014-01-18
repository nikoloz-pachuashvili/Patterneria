package org.patterneria.iterator;

/**
 * Metro station
 */
public final class Station {
    private final String name;
    private String notification;

    /**
     * Metro station name
     *
     * @return Metro station name
     */
    public String getName() {
        return this.name;
    }

    public String getNotification(){
        return this.notification;
    }

    public void setNotification(String notification){
        this.notification = notification;
    }

    /**
     * Initializes the new instance of metro station
     *
     * @param name
     *          Metro station name
     */
    public Station(String name) {
        this(name, null);
    }

    /**
     * Initializes the new instance of metro station
     *
     * @param name
     *          Metro station name
     * @param notification
     *          Some notification to announce
     */
    public Station(String name, String notification) {
        this.name = name;
        this.notification = notification;
    }
}
