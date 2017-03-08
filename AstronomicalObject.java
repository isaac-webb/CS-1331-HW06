// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * An abstract class that defines the basic properties and methods of an
  * AstronomicalObject.
  *
  * @author iwebb6
  * @version 1.0
  */
public abstract class AstronomicalObject implements Comparable
    <AstronomicalObject> {
    private static int objectCount = 0;
    private String id;
    private SizeClass size;

    /**
      * The default constructor that takes in the AstronomicalObject's size and
      * creates the AstronomicalObject, assigning a random ID.
      *
      * @param size The size of the AstronomicalObject
      */
    public AstronomicalObject(SizeClass size) {
        id = generateID();
        this.size = size;
        objectCount++;
    }

    /**
      * A no args constructor as a back up that creates an AstronomicalObject of
      * size Teeny. The constructor that takes size as an argument is preferred.
      */
    public AstronomicalObject() {
        this(SizeClass.TEENY);
    }

    /**
      * This method returns what it looks like when the AstronomicalObject is
      * observed.
      *
      * @return A String showing what the AstronomicalObject looks like
      */
    public abstract String observed();

    /**
      * Returns the number of AstronomicalObjects that have been created so far.
      *
      * @return The number of AstronomicalObjects created
      */
    public static int getObjectCount() {
        return objectCount;
    }

    /**
      * Returns the AstronomicalObject's randomly generated id.
      *
      * @return The AstronomicalObject's id
      */
    public String getId() {
        return id;
    }

    /**
      * Returns the size of the AstronomicalObject.
      *
      * @return The AstronomicalObject's size
      */
    public SizeClass getSize() {
        return size;
    }

    /**
      * A compareTo implementation that compares AstronomicalObject's based on
      * their size property.
      *
      * @param ao The AstronomicalObject to compare this one to
      * @return 1 if this AstronomicalObject is greater than the input, 0 if
      *         they are equal, and -1 if it is less than the input
      */
    public int compareTo(AstronomicalObject ao) {
        return ao.size.compareTo(size);
    }

    /**
      * A toString implementation that returns the AstronomicalObject's id.
      *
      * @return A String containing the AstronomicalObject's id
      */
    @Override
    public String toString() {
        return id;
    }

    /**
      * A method that generates a random ID based upon the type of the
      * object. You should use this each time the AstronomicalObject constructor
      * is called.
      *
      * @return A randomly generated ID for the instance the method
      *         is called on
      */
    private String generateID() {
        Random randGen = new Random();
        String hex = Integer.toHexString(randGen.nextInt());
        return this.getClass().getName() + "-" + hex;
    }
}
