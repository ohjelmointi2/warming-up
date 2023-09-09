package part01;

public class FixingBugs {

    /**
     * Hint: https://stackoverflow.com/q/8464807
     *
     * @param text
     * @param toUpper
     * @return
     */
    public String changeCase(String text, boolean toUpper) {
        if (toUpper) {
            text.toUpperCase();
        } else {
            text.toLowerCase();
        }
        return text;
    }

    /**
     * Hint: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
     *
     * @param dayOfWeek
     * @return
     */
    public String nameOfWeekday(int dayOfWeek) {
        String name = "";

        switch (dayOfWeek) {
            case 0:
                name = "maanantai";
            case 1:
                name = "tiistai";
            case 2:
                name = "keskiviikko";
            case 3:
                name = "torstai";
            case 4:
                name = "perjantai";
            case 5:
                name = "lauantai";
            case 6:
                name = "sunnuntai";
        }

        return name;
    }

    /**
     *
     * @param numbers
     * @return
     */
    public int maximum(int[] numbers) {
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
     * Hint: https://stackoverflow.com/q/60791518
     *
     * @param a
     * @param b
     * @return
     */
    public long sumOfLargeIntegers(int a, int b) {
        return a + b;
    }

    /**
     * Hint: https://stackoverflow.com/q/513832
     *
     * @param value
     * @return
     */
    public boolean parseYesOrNo(String value) {
        if (value.toLowerCase() == "yes") {
            return true;
        }
        return false;
    }
}
