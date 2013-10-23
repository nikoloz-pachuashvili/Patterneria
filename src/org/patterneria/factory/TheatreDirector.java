package org.patterneria.factory;

/**
 * Theater director (Abstract factory)
 *
 * Responsible to stage several plays (Create spectacles)
 */
public interface TheatreDirector {

    /**
     * Gets the name of director
     *
     * @return The name of director
     */
    public String getName();

    /**
     * Stages play and creates spectacle
     *
     * @param play The name of play
     *
     * @return The instance of Spectacle
     */
    public Spectacle stage(String play);
}
