// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * A class defining the properties of an Spaceship, which is a kind of
  * AstronomicalObject.
  *
  * @author iwebb6
  * @version 1.0
  */
public class Spaceship extends AstronomicalObject implements Attackable,
    Embarkable {
    private static Random rand = new Random();

    /**
      * The default constructor for a Spaceship. Creates a Spaceship with a
      * random id and a randomly chosen SizeClass (either Teeny or Tiny).
      */
    public Spaceship() {
        super(rand.nextInt(2) == 0 ? SizeClass.TEENY : SizeClass.TINY);
    }

    /**
      * This method returns what it looks like when the Spaceship is observed.
      *
      * @return A String showing what the Spaceship looks like
      */
    @Override
    public String observed() {
        switch (getSize()) {
        case TEENY:
            return toString() + " is a scout ship with a small crew, quick "
                   + "and agile";
        case TINY:
            return toString() + " is a sizeable expeditionary spacecraft with "
                   + "enough room to house a founding colony";
        default:
            return toString() + " is a VERY special spaceship :)";
        }

    }

    /**
      * Returns a String containing what happens when the Spaceship is attacked.
      *
      * @return A String containing what happens when attacked
      */
    @Override
    public String attacked() {
        if (rand.nextInt(100) >= Attackable.DODGE_CHANCE) {
            return toString() + " explodes violently after a critical hit";
        } else {
            return toString() + " quickly performs evasive maneuvers to dodge "
                   + "your lasers";
        }
    }

    /**
      * Returns a String containing what happens when the Spaceship is boarded.
      *
      * @return A String containing what happens when boarded
      */
    @Override
    public String boarded() {
        if (rand.nextInt(100) < Embarkable.CAN_EMBARK) {
            return toString() + " strangely allows your crew to board the ship";
        } else {
            return toString() + " has an anti-personnel system too "
                   + "sophisticated to board";
        }
    }
}
