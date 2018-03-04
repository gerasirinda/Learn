package main.java.employeeLab.model;

public enum Skill {
    JAVA("Can develop new things using Java"),
    TEST("Can test an awful things"),
    ENGLISH("Can speak"),
    TEAM_PLAYER("Can work with somebody");

    String description;

    Skill(String description) {
        this.description = description;
    }

    public static Skill checkedValue(String skillName) {
        Skill skill;
        try {
            skill = valueOf(skillName.toUpperCase());
        } catch (IllegalArgumentException exception) {
            return null;
        }
        return skill;
    }


}
