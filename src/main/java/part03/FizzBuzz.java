package part03;

import java.util.ArrayList;
import java.util.List;

/**
 * See https://en.wikipedia.org/wiki/Fizz_buzz
 */
public class FizzBuzz {

    /**
     * > "...any number divisible by three is replaced by the word fizz and any
     * > number divisible by five by the word buzz. Numbers divisible by both three
     * > and five (i.e. divisible by 15) become fizz buzz"
     * >
     * > https://en.wikipedia.org/wiki/Fizz_buzz
     *
     * @param number
     * @return "fizzbuzz", "fizz", "buzz" or the given number as string
     */
    public String get(int number) {
        return "fizzbuzz";
    }

    /**
     * @param from the first number to do FizzBuzz with
     * @param to   the last number in the list, inclusive
     * @return a list of strings "fizz", "buzz", "fizzbuzz" and numeric strings
     */
    public List<String> getList(int from, int to) {
        return new ArrayList<String>();
    }
}
