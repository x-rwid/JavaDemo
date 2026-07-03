package projectoop;

public class PlayerGoalKeeper extends PlayerFootball {
    private int countOfSaves;

    public PlayerGoalKeeper(String nameOfPlayer, int numberPosition, String teamName,
                            int countOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, numberPosition,  teamName, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }
    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }
}
