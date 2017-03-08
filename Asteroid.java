// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * A class defining the properties of an Asteroid, which is a kind of
  * AstronomicalObject.
  *
  * @author iwebb6
  * @version 1.0
  */
public class Asteroid extends AstronomicalObject implements Attackable,
    Embarkable, Scannable {
    private static Random rand = new Random();

    /**
      * The default constructor for an Asteroid. Creates an Asteroid with a
      * random id and a randomly chosen SizeClass (either Small or Medium).
      */
    public Asteroid() {
        super(rand.nextInt(2) == 0 ? SizeClass.SMALL : SizeClass.MEDIUM);
    }

    /**
      * This method returns what it looks like when the Asteroid is observed.
      *
      * @return A String showing what the Asteroid looks like
      */
    @Override
    public String observed() {
        switch (getSize()) {
        case SMALL:
            return toString() + " is your average asteroid, big enough to land"
                   + " and camp on";
        case MEDIUM:
            return toString() + " is the largest in the belt, bigger than "
                   + "Mount Everest back on Earth";
        default:
            return toString() + " is a VERY special asteroid :)";
        }
    }

    /**
      * Returns a String containing what happens when the Asteroid is attacked.
      *
      * @return A String containing what happens when attacked
      */
    @Override
    public String attacked() {
        if (rand.nextInt(100) >= Attackable.DODGE_CHANCE) {
            return toString() + " bursts into a thousand pieces";
        } else {
            return toString() + " collides with another asteroid and narrowly "
                   + "misses your lasers";
        }
    }

    /**
      * Returns a String containing what happens when the Asteroid is boarded.
      *
      * @return A String containing what happens when boarded
      */
    @Override
    public String boarded() {
        if (rand.nextInt(100) < Embarkable.CAN_EMBARK) {
            return toString() + " has a rough surface, but you place some "
                   + "remote telemtry equipment anyhow";
        } else {
            return toString() + " is surrounded by smaller asteroids, making "
                   + "it too difficult to land on";
        }
    }

    /**
      * Returns the material composition of the Asteroid.
      *
      * @return A String containing the composition of the Asteroid
      */
    @Override
    public String scanned() {
        return toString() + " is a solid, rocky, body coated in a layer of ice";
    }
}
