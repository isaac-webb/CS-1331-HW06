// I worked on the homework assignment alone, using only course materials.

/**
  * An interface defining what it means for an object to be Attackable.
  *
  * @author iwebb6
  * @version 1.0
  */
public interface Attackable {
    /**
      * The chance that an AstronomicalObject dodges your attack.
      */
    int DODGE_CHANCE = 40;

    /**
      * Returns a String containing what happens when the object is attacked.
      *
      * @return A String containing what happens when attacked
      */
    String attacked();
}
