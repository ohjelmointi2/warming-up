package part04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ClassesAndObjectsTest {

    private final List<Person> people = List.of(
            new Person("Rachel", 28),
            new Person("Monica", 29),
            new Person("Ross", 33),
            new Person("Phoebe", 32),
            new Person("Joey", 29),
            new Person("Chandler", 31));

    @Test
    void testNameStringWithEmptyArray() {
        var obj = new ClassesAndObjects();
        assertEquals("", obj.generateNamesString(Collections.emptyList()));
    }

    @Test
    void testNameStringWithTwoPeople() {
        var obj = new ClassesAndObjects();
        assertEquals("Rachel and Monica", obj.generateNamesString(people.subList(0, 2)));
    }

    @Test
    void testNameStringWithThreePeople() {
        var obj = new ClassesAndObjects();
        assertEquals("Rachel, Monica and Ross", obj.generateNamesString(people.subList(0, 3)));
    }

    @Test
    void testNameStringWithSixPeople() {
        var obj = new ClassesAndObjects();
        assertEquals("Rachel, Monica and 4 others", obj.generateNamesString(people));
    }
}
