package projectoop;

public class PlayerBasketball extends Player {
    private int numberOfGoals;

    public PlayerBasketball(String nameOfPlayer, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, "Basketball", numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }
    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
}
