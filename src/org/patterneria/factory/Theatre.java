package org.patterneria.factory;

import java.util.Map;

/**
 * Theatre (The context)
 */
public class Theatre {
    String name;
    TheatreDirector director;
    Map<String, Spectacle> repertoire;

    /**
     * Gets the name of theatre
     *
     * @return The name of theatre
     */
    public String getName(){
        return  this.name;
    }

    /**
     * Gets theatre director
     *
     * @return The theatre director
     */
    public TheatreDirector getDirector() {
        return director;
    }

    /**
     * Sets theatre director
     *
     * @param director The theatre director
     */
    public void setDirector(String name, TheatreDirector director) {
        this.name = name;
        this.director = director;
    }

    /**
     * Creates instance of theatre
     *
     * @param director The theatre director
     */
    public Theatre(TheatreDirector director) {
        this.director = director;
    }

    /**
     * Stage the play and announce premiere
     *
     * @param play The play
     */
    public void StagePlay(String play){

        Spectacle spectacle = this.director.stage(play);

        this.repertoire.put(play, spectacle);

        announcePremiere(play);
    }

    /**
     * Performs spectacle
     *
     * @param name The name of spectacle
     */
    public void PerformSpectacle(String name){
        Spectacle spectacle = this.repertoire.get(name);

        if (spectacle == null){
            System.out.println(String.format("Sorry, The \"%s\" is not in our repertoire", name));
            return;
        }

        spectacle.perform();
    }

    private void announcePremiere(String play){
        String announcement = String.format("%s by %s\nPremiere in %s", play, this.director.getName(), this.name);
        System.out.println(announcement);
    }
}
