package projectoop;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void sound() {
        IO.println("Hayvanlar ovozi");
    }
}
