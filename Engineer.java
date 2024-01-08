import java.util.Arrays;

public class Engineer extends Employee {
    private String[] skills;

    // public Engineer(String name, String department, double salary) {
    // super(name, department, salary);
    // }

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;

    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;

    }

    @Override
    public String toString() {
        return "Skills   " + Arrays.toString(skills);
    }
}
