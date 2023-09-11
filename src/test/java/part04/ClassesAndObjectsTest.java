package part04;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testGenerateNamesString() {
        var obj = new ClassesAndObjects();

        assertEquals("Rachel and Monica", obj.generateNamesString(people.subList(0, 2)));
    }
}
