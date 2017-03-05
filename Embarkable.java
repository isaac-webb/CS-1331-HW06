// I worked on the homework assignment alone, using only course materials.

/**
  * An interface defining what it means for an object to be Embarkable.
  *
  * @author iwebb6
  * @version 1.0
  */
public interface Embarkable {
    /**
      * The chance that you will be able to embark the object.
      */
    int CAN_EMBARK = 70;

    /**
      * Returns a String containing what happens when the object is boarded.
      *
      * @return A String containing what happens when boarded
      */
    String boarded();
}
