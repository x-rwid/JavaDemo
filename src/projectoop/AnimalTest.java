package projectoop;

public class AnimalTest {
    static void main() {

        Animal dog = new AnimalDog("Balto");
        Animal cat = new AnimalCat("Etik Kiygan Muwuk");
        Animal duck = new AnimalDuck("Scrooge McDuck");

        IO.print(dog.getName() + " aytadi: " );
        dog.sound();

        IO.print(cat.getName() + " aytadi: " );
        cat.sound();

        IO.print(duck.getName() + " aytadi: " );
        duck.sound();
    }
}
