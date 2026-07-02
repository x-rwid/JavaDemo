package projectoop;

public class AnimalDog extends Animal {
    public AnimalDog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        IO.println("bow bow");
    }
}
