// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * A class defining the properties of a Star, which is a kind of
  * AstronomicalObject.
  *
  * @author iwebb6
  * @version 1.0
  */
public class Star extends AstronomicalObject implements Scannable {
    private static Random rand = new Random();

    /**
      * The default constructor for a Star. Creates a Star with a random id and
      * a randomly chosen SizeClass (either Massive or Gigantic).
      */
    public Star() {
        super(rand.nextInt(2) == 0 ? SizeClass.MASSIVE : SizeClass.GIGANTIC);
    }

    /**
      * This method returns what it looks like when the Star is observed.
      *
      * @return A String showing what the Star looks like
      */
    @Override
    public String observed() {
        switch (getSize()) {
        case MASSIVE:
            return toString() + " is seen dimly at a distance";
        case GIGANTIC:
            return toString() + " shines brightly ahead";
        default:
            return toString() + " is a very, VERY special star :)";
        }
    }

    /**
      * Returns the material composition of the Star.
      *
      * @return A String containing the composition of the Star
      */
    @Override
    public String scanned() {
        return toString() + " is mainly composed of hydrogen and helium";
    }
}
