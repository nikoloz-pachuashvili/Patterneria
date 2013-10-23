package org.patterneria.factory;

/**
 * Director "A" (Concrete factory)
 */
public class DirectorA implements TheatreDirector {

    /**
     * The name of director
     *
     * @return The name of director
     */
    @Override
    public String getName() {
        return "A";
    }

    /**
     * Stage the spectacle
     *
     * @param play The name of play
     * @return The spectacle
     */
    @Override
    public Spectacle stage(String play) {

        Spectacle spectacle;

        if (play == "The 39 Steps") {
            spectacle = new The39StepsByA();
        } else if (play == "Richard III") {
            spectacle = new RichardIIIByA();
        } else if (play == "An Inspector Calls") {
            spectacle = new AnInspectorCallsByA();
        } else {
            throw new UnsupportedOperationException(String.format("Unable to stage $s", play));
        }

        return spectacle;
    }
}
