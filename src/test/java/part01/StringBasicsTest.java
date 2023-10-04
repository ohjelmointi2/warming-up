package part01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringBasicsTest {

    // The object we are testing
    private StringBasics solution = new StringBasics();

    @Test
    void testGetFizzBuzz() {
        assertEquals("1", solution.getFizzBuzz(1));
        assertEquals("2", solution.getFizzBuzz(2));
        assertEquals("Fizz", solution.getFizzBuzz(3));
        assertEquals("4", solution.getFizzBuzz(4));
        assertEquals("Buzz", solution.getFizzBuzz(5));
        assertEquals("Fizz", solution.getFizzBuzz(6));
        assertEquals("7", solution.getFizzBuzz(7));
        assertEquals("8", solution.getFizzBuzz(8));
        assertEquals("Fizz", solution.getFizzBuzz(9));
        assertEquals("Buzz", solution.getFizzBuzz(10));
        assertEquals("11", solution.getFizzBuzz(11));
        assertEquals("Fizz", solution.getFizzBuzz(12));
        assertEquals("13", solution.getFizzBuzz(13));
        assertEquals("14", solution.getFizzBuzz(14));
        assertEquals("FizzBuzz", solution.getFizzBuzz(15));
    }

    @Test
    void testParseYesOrNo() {
        assertTrue(solution.parseYesOrNo("yes"), "yes in lower case");
        assertTrue(solution.parseYesOrNo("YES"), "yes in upper case");
        assertTrue(solution.parseYesOrNo("Yes"), "yes with first letter in upper case");
        assertFalse(solution.parseYesOrNo("no"), "no in lower case");
        assertFalse(solution.parseYesOrNo("NO"), "no in upper case");
        assertFalse(solution.parseYesOrNo("No"), "no with first letter in upper case");
    }

    @Test
    void testTruncate() {
        assertEquals("He", solution.truncate("Hello", 2));
        assertEquals("Hello", solution.truncate("Hello", 5));
        assertEquals("Hello", solution.truncate("Hello", 10));
    }
}
