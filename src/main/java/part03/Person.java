package part03;

/**
 * The `Person` class represents an individual with a name and age. The class
 * is incomplete and needs to be fixed. You will need to add private variables
 * for storing the name and age, and fix the constructor and the getter methods.
 *
 * Do not change the signatures of the methods already provided.
 *
 * You can use the JUnit test provided to verify that your implementation works
 * as expected. You can also write a main method to test your implementations.
 */
public class Person {

    /**
     * Constructs a new `Person` object with the specified name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        // TODO: implement this constructor
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person as an integer.
     */
    public int getAge() {
        return 0; // TODO: implement this method
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person as a string.
     */
    public String getName() {
        return null; // TODO: implement this method
    }

    /**
     * Returns a string representation of the person.
     */
    @Override
    public String toString() {
        return "Person [name=" + getName() + ", age=" + getAge() + "]";
    }
}
