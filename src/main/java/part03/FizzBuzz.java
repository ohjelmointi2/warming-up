package part03;

import java.util.ArrayList;
import java.util.List;

/**
 * The `FizzBuzz` class implements the FizzBuzz game, a simple number game.
 * See https://en.wikipedia.org/wiki/Fizz_buzz for more details on the game
 * rules.
 *
 * This exercise has been written with the aid of ChatGPT.
 */
public class FizzBuzz {

    /**
     * Returns the FizzBuzz result for a given number.
     *
     * > "...any number divisible by three is replaced by the word fizz and any
     * > number divisible by five by the word buzz. Numbers divisible by both three
     * > and five (i.e. divisible by 15) become fizz buzz"
     * >
     * > https://en.wikipedia.org/wiki/Fizz_buzz
     *
     * @param number The input number to be evaluated.
     * @return "fizzbuzz," "fizz," "buzz," or the given number as a string.
     */
    public String get(int number) {
        // FIXME: based on the logic above, return the correct string

        return "fizzbuzz";
    }

    /**
     * Returns a list of FizzBuzz results for a range of numbers.
     *
     * This method generates FizzBuzz results for numbers in the specified range
     * (from `from` to `to`, inclusive) and returns a list of corresponding strings.
     *
     * @param from The first number to start the FizzBuzz game.
     * @param to   The last number in the list, inclusive.
     * @return A list of strings containing "fizz," "buzz," "fizzbuzz," and numeric
     *         strings.
     */
    public List<String> getListOfFizzesAndBuzzes(int from, int to) {
        // FIXME: fill a list with appropriate values and return it
        // Hint: you can call `this.get` to get the result for a single number.

        return new ArrayList<String>();
    }
}
