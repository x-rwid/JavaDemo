package projectoop;

public class PlayerSetter extends PlayerVolleyball {
    private int countOfSets;

    public PlayerSetter(String nameOfPlayer, int numberPosition, String teamName,
                        int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }
    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }
}
