package projectoop;

public class AnimalCat extends Animal {
    public AnimalCat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        IO.println("meow meow");
    }
}
