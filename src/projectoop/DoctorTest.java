package projectoop;

public class DoctorTest {
    static void main() {

        Doctor surgeon = new Doctor("Abu Ali ibn Sina", 40);

        DoctorENT entDoctor = new DoctorENT("Dr. AbdulHay", 8, true);

        IO.println("=== Tabiblar Haqida Ma'lumat ===");
        surgeon.displayInfo();
        entDoctor.displayInfo();
    }
}
