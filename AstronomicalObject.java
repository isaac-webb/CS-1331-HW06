import java.util.Random;

//YOUR CODE HERE: Edit the class header to include all necessary information.
//Rember that you should not be able to create a new instance of this class.
public class AstronomicalObject {
    //YOUR CODE HERE: Add necessary instance variables


    //YOUR CODE HERE: Implement the necessary constructor (only one)


    //YOUR CODE HERE: Add all required methods


    //NOTE: DON'T CHANGE ANY CODE PAST THIS LINE
    /**
     * A method that generates a random ID based upon the type of the
     * object. You should use this each time the AstronomicalObject constructor
     * is called.
     *
     * @return The A randomly generated ID for the instance the method
     *         is called on
     */
    private String generateID() {
        Random randGen = new Random();
        String hex = Integer.toHexString(randGen.nextInt());
        return this.getClass().getName() + "-" + hex;
    }
}
