package test.java.employeeLab.model;

import main.java.employeeLab.Service;
import main.java.employeeLab.exception.ValidationException;
import main.java.employeeLab.model.Employee;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServiceTest {

    Service service;
                @Rule
                public ExpectedException thrown=ExpectedException.none();
                @Before
               public void setUp(){
                    service = new Service();
        }
    @Test (expected = ValidationException.class)
    public void shouldThrowValidationExceptionForNullName() throws ValidationException{
        service.register(null,"Abc","a@b.com");
    }
    @Test
    public void  shouldThrowValidationExceptionForNullSurname () throws ValidationException{
        thrown.expect(ValidationException.class);
        thrown.expectMessage("Surname should be an empty string");
        service.register("Alex","","a@b.com");
    }
}

