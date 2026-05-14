package projectoop;

public class PersonID {
    static void main() {

        Person person1 = new Person("Xurwid ", "Farsiy ", "Erkak ", 36, "Dasturci");
        Person person2 = new Person("Maryam ", "Arabiy ", "Ayol ", 25, "Designer");

        person1.info();
        person2.info();

        IO.println(person1.job + " " + person1.name + person1.age + " yowda");
        IO.println(person2.job + " " + person2.name + person2.age + " yowda");
    }
}
