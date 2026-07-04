package projectoop;

public class PersonsTest {
    static void main() {

        Persons persons = new Persons("Ali", "Warof Rawidov ko'ca");
        IO.println(persons.toString());

        persons.setAddress("Hamroh ko'ca");
        IO.println("Yangilangan manzil: " + persons.getAddress());
        IO.println();

        PersonsStudent student = new PersonsStudent("Layla", "Milliy ko'ca",
                "Designer", 1, 1000);
        IO.println(student.toString());

        student.setFee(900);
        IO.println("Yangilangan to'lov: $" + student.getFee());
        IO.println();

        PersonsStaff staff = new PersonsStaff("Xurwid", "Tiklaniw ko'ca", "Maktab #2", 5000);
        IO.println(staff.toString());

        staff.setPay(7000);
        IO.println("Yangilangan iw haqqi: $" + staff.getPay());
    }
}
