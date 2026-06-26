package projectoop;

public class DoctorENT extends Doctor {
    private boolean performSurgery;

    public DoctorENT(String name, int experienceYears, boolean performSurgery) {
        super(name, experienceYears);
        this.performSurgery = performSurgery;
    }

    public boolean isPerformSurgery() {
        return performSurgery;
    }

    public void setPerformSurgery(boolean performSurgery) {
        this.performSurgery = performSurgery;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Mutaxassislik: LOR");
        IO.println("Jarrohlik Amaliyati: " + (performSurgery ? "Bor" : "Yo'q"));
        IO.println("------------------------------");
    }
}
