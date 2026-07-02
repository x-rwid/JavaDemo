package projectoop;

public class AnimalDuck extends Animal {
    public AnimalDuck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        IO.println("quack quack");
    }
}
