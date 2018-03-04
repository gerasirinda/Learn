package main.java.employeeLab;

import main.java.employeeLab.exception.ValidationException;
import main.java.employeeLab.model.Employee;
import main.java.employeeLab.model.SalaryManager;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe");
        try {
            employee.setSalary(new SalaryManager() {
                @Override
                public long changeSalary(long oldSalary, boolean isRaise) {
                    return oldSalary * 2;

                }
            });
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        try {
            employee.setSalary((oldSalary, isRaise) -> {
                if (oldSalary == 0) {
                    return 200;

                }
                if (isRaise) {
                    return oldSalary * 6;
                } else
                    return oldSalary / 2;
            });
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
