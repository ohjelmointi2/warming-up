package part01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FixingBugsTest {

    private FixingBugs fixes = new FixingBugs();

    @Test
    void testChangeCase() {
        var text = "Hello";

        assertEquals("HELLO", fixes.changeCase(text, true));
        assertEquals("hello", fixes.changeCase(text, false));
    }

    @Test
    void testMaximum() {
        int[] numbers = { 0, 1, 2, 3, 100, 15, 200, 20 };

        assertEquals(200, fixes.maximum(numbers));
    }

    @Test
    void testNameOfWeekday() {
        assertEquals("maanantai", fixes.nameOfWeekday(0));
        assertEquals("tiistai", fixes.nameOfWeekday(1));
        assertEquals("keskiviikko", fixes.nameOfWeekday(2));
        assertEquals("sunnuntai", fixes.nameOfWeekday(6));
    }

    @Test
    void testParseYesOrNo() {
        assertTrue(fixes.parseYesOrNo("Yes"));
        assertFalse(fixes.parseYesOrNo("No"));
    }

    @Test
    void testSumOfLargeIntegers() {
        var a = 2_000_000_000;
        var b = 2_000_000_000;

        assertEquals(4_000_000_000L, fixes.sumOfLargeIntegers(a, b));
    }
}
