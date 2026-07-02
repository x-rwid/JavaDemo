package projectoop;

public class AnimalTest {
    static void main() {

        Animal myDog = new AnimalDog("Balto");
        Animal myCat = new AnimalCat("Etik Kiygan Muwuk");
        Animal myDuck = new AnimalDuck("Scrooge McDuck");

        IO.print(myDog.getNome() + " aytadi: " );
        myDog.sound();

        IO.print(myCat.getNome() + " aytadi: " );
        myCat.sound();

        IO.print(myDuck.getNome() + " aytadi: " );
        myDuck.sound();
    }
}
