package test.java.employeeLab.model;

import main.java.employeeLab.model.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void toStringShouldReturnNameAndSurname () {
        Person person = new Person("John", "Doe");
        assertEquals("John Doe", person.toString());
    }

}
