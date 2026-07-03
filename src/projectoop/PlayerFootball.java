package projectoop;

public class PlayerFootball extends Player {
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public PlayerFootball(String nameOfPlayer, int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, "Football", numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }
    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }
    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }
    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }
}
