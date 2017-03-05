// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * A class defining the properties of a Planet, which is a kind of
  * AstronomicalObject.
  *
  * @author iwebb6
  * @version 1.0
  */
public class Planet extends AstronomicalObject implements Embarkable,
    Scannable {
    private static Random rand = new Random();

    /**
      * The default constructor for a Planet. Creates a Planet with a random id
      * and a randomly chosen SizeClass (either Largish or Huge).
      */
    public Planet() {
        super(rand.nextInt(2) == 0 ? SizeClass.LARGISH : SizeClass.HUGE);
    }

    /**
      * This method returns what it looks like when the Planet is observed.
      *
      * @return A String showing what the Planet looks like
      */
    @Override
    public String observed() {
        switch (getSize()) {
        case LARGISH:
            return toString() + " can be seen ahead, about the size of Earth "
                   + "with two moons";
        case HUGE:
            return toString() + " dwarfs you, larger than Jupiter with twelve "
                   + "moons";
        default:
            return toString() + " is a very, VERY special planet :)";
        }
    }

    /**
      * Returns a String containing what happens when the Planet is boarded.
      *
      * @return A String containing what happens when boarded
      */
    @Override
    public String boarded() {
        if (rand.nextInt(100) < Embarkable.CAN_EMBARK) {
            return toString() + " around you swarm thousands of aliens, "
                   + "greeting you with copious amounts of food";
        } else {
            return toString() + " surface proves too difficult to land on";
        }
    }

    /**
      * Returns the material composition of the Planet.
      *
      * @return A String containing the composition of the Planet
      */
    @Override
    public String scanned() {
        return toString() + " is a solid body, consisting of a nitrogen/oxygen "
               + "atmosphere and an iron core";
    }
}
