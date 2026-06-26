package projectoop;

public class Doctor {

    private String name;
    private int experienceYears;

    public Doctor(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void displayInfo() {
        IO.println("Tabibni ismi: " + name);
        IO.println("Tajriba yillari: " + experienceYears);
    }
}
