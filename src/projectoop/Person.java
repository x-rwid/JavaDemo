package projectoop;

public class Person {

    // field'lar
    String name;
    String nationality;
    String gender;
    int age;
    String job;

    // object'ni iwga tuwiriw ucun constructor
    public Person(String name, String nationality, String gender, int age, String job) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.age = age;
        this.job = job;
    }

    // method
    public void info() {
        IO.println("Ismi: " + name + "Millati: " + nationality + "Jinsi: " + gender
                + "Yowi: " + age + " Kasbi: " + job);
    }
}
