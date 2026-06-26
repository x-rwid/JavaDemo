package projectoop;

public class DoctorSurgeon extends Doctor {
    private String sugeryType;

    public DoctorSurgeon(String name, int experienceYears, String sugeryType) {
        super(name, experienceYears);
        this.sugeryType = sugeryType;
    }

    public String getSugeryType() {
        return sugeryType;
    }

    public void setSugeryType(String sugeryType) {
        this.sugeryType = sugeryType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Mutaxassislik: Jarroh");
        IO.println("Jarrohlik Turi: " + sugeryType);
        IO.println("------------------------------");
    }
}
