package main.java.employeeLab.model;

@FunctionalInterface
public interface SalaryManager {
    long changeSalary(long oldSalary, boolean isRaise);
}
