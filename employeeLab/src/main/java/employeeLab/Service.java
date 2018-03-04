package main.java.employeeLab;

import main.java.employeeLab.exception.ValidationException;
import main.java.employeeLab.model.Employee;

public class Service {
    public Employee register(String name, String surname, String email) throws ValidationException {
        if (checkString(name)) {
            throw new ValidationException("Name should be an empty string");
        }
        if (checkString(surname)) {
            throw new ValidationException("Surname should be an empty string");
        }
        return new Employee(name, surname);
    }
    private  boolean checkString(String value) {
        return value == null || "".equals(value.trim());
    }
}
