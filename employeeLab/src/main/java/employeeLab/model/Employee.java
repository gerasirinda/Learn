package main.java.employeeLab.model;

import main.java.employeeLab.exception.ValidationException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee extends Person {

 private   Map<Skill, Integer> skills;
private long salary;
private String email;

    public Employee(String name, String surname) {
        super(name, surname);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth) {
        super(name, surname, dateOfBirth);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth, Map<Skill, Integer> skills) {
        super(name, surname, dateOfBirth);
        this.skills = skills;
    }

    public int hasSkill(String skillName) {
        if (skillName == null) {
            return -1;
        }
        Skill skill = Skill.checkedValue(skillName);
        return skill == null || skills.get(skill) == null? -1 : skills.get(skill);
    }

    /**
     * @param skill - {@code Skill} new skill
     * @param level
     * @return boolean true if skill was added
     */
    public boolean addNewSkill(Skill skill, int level) {
        int value = hasSkill(skill.name());
        if (value != -1) {
            System.out.println(String.format("This skill already exists with %value", value));
            return false;
        }
        skills.put(skill, level);
        return true;

    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(SalaryManager manager) throws ValidationException {
        long newSalary = manager.changeSalary(salary, true);
        if (newSalary <=0){
            throw new ValidationException();
        }
        salary = newSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
