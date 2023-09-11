package part01;

/**
 * The `FixingBugs` class contains methods with known issues that need to be
 * fixed.
 *
 * These methods perform various tasks but currently have bugs or incorrect
 * logic.
 *
 * Your task is to identify and fix these issues.
 *
 * This exercise has been written with the aid of ChatGPT.
 */
public class FixingBugs {

    /**
     * Changes the case of a given text based on the `toUpper` parameter.
     *
     * @param text    The input text whose case needs to be changed.
     * @param toUpper A boolean flag indicating whether to convert to uppercase
     *                (true) or lowercase (false).
     * @return The modified text with the specified case.
     */
    public String changeCase(String text, boolean toUpper) {
        // FIXME: the method appears to always return the given string unmodified
        // Hint: https://stackoverflow.com/q/8464807

        if (toUpper) {
            text.toUpperCase();
        } else {
            text.toLowerCase();
        }
        return text;
    }

    /**
     * Returns the name of a day of the week based on the provided day of the week
     * number.
     *
     * "The int value follows the ISO-8601 standard, from 1 (Monday) to 7 (Sunday)."
     *
     * @see https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
     *
     * @param dayOfWeek An integer representing the day of the week (1-7).
     * @return The name of the day of the week in Finnish: "maanantai", "tiistai",
     *         "keskiviikko", "torstai", "perjantai", "lauantai" or "sunnuntai"
     */
    public String finnishNameOfDay(int dayOfWeek) {
        // FIXME: the code seems to always return the same result
        // Hint: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        String name = "";

        switch (dayOfWeek) {
            case 1:
                name = "maanantai";
            case 2:
                name = "tiistai";
            case 3:
                name = "keskiviikko";
            case 4:
                name = "torstai";
            case 5:
                name = "perjantai";
            case 6:
                name = "lauantai";
            case 7:
                name = "sunnuntai";
        }

        return name;
    }

    /**
     * Finds the maximum value in an array of integers.
     *
     * @param numbers An array of integers.
     * @return The maximum value in the array.
     */
    public int maximum(int[] numbers) {
        // FIXME: the code works with some arrays, but not with all of them

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {
                return max;
            }
        }
        return max;
    }

    /**
     * Computes the sum of two large integers. As the sum of two integers may
     * overflow the maximum capacity for `int`, the result is represented as `long`.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers as a long.
     */
    public long sumOfLargeIntegers(int a, int b) {
        // FIXME: we get negative numbers when adding two large positives
        // Hint: https://stackoverflow.com/q/60791518

        return a + b;
    }

    /**
     * Parses a text and returns `true` if it matches the string "yes"
     * (case-insensitive).
     *
     * @param text The input text to be parsed.
     * @return `true` if the text is "yes," otherwise `false`.
     */
    public boolean parseYesOrNo(String text) {
        // FIXME: this seems to always return false, even when the `text` is "yes"

        if (text.toLowerCase() == "yes") {
            return true;
        }
        return false;
    }
}
