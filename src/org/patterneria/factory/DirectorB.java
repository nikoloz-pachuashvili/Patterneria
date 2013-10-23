package org.patterneria.factory;

/**
 * Director "B" (Concrete factory)
 */
public class DirectorB  implements TheatreDirector{

    /**
     * Gets the name of director
     *
     * @return the name of director
     */
    @Override
    public String getName() {
        return "B";
    }

    /**
     *  Stage the spectacle
     *
     * @param play The name of play
     *
     * @return The spectacle
     */
    @Override
    public Spectacle stage(String play) {

        Spectacle spectacle;

        if (play == "The 39 Steps") {
            spectacle = new Les39MarchesByB();
        }
        else if(play == "Richard III"){
            spectacle = new RichardIIIByB();
        }
        else{
            throw new UnsupportedOperationException(String.format("Unable to stage $s", play));
        }

        return spectacle;
    }
}
