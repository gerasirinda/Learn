package test.java.employeeLab.model;

import main.java.employeeLab.model.Employee;
import main.java.employeeLab.model.Skill;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static main.java.employeeLab.model.Skill.ENGLISH;

public class EmployeeTest {
    private Employee employee;
    private Employee cleverEmployee;
    private Map<Skill, Integer> skills;

    @Before
    public void setUp() {
        employee = new Employee("John", "Doe");
        skills = new HashMap<>();
        skills.put(Skill.JAVA, 3);
        skills.put(Skill.TEAM_PLAYER, 2);
        Date dateOfBirth = new Date();
        cleverEmployee = new Employee("Sara", "Doe", dateOfBirth, skills);
    }


    @Test
    public void hasSkillShouldReturnMinusOneForMissingSkill() {
        assertEquals(-1, employee.hasSkill("Cooking"));
    }

    @Test
    public void hasSkillShouldReturnMinusOneForNullSkill() {
        assertEquals("hsSkill should return -1 for null", -1, employee.hasSkill(null));
    }

    @Test
    public void hasSkillShouldReturnSkillValue() {
        assertEquals(3, cleverEmployee.hasSkill("JAVA"));
        assertEquals(2, cleverEmployee.hasSkill("TEAM_PLAYER"));
    }

    @Test
    public void hasSkillShouldReturnSkillValueIgnoreCase() {
        assertEquals(3, cleverEmployee.hasSkill("java"));
        assertEquals(2, cleverEmployee.hasSkill("Team_Player"));
    }
    @Test
    public void addNewSkillShouldUpdateSkillMapAndReturnTrue(){
        assertTrue(cleverEmployee.addNewSkill(ENGLISH, 5));
    }

}
