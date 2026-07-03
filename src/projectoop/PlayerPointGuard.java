package projectoop;

public class PlayerPointGuard extends PlayerBasketball {
    private int countOfGuard;

    public PlayerPointGuard(String nameOfPlayer, int numberPosition, String teamName,
                            int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }
    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }
}
