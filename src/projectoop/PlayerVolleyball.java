package projectoop;

public class PlayerVolleyball extends Player {
    private int numberOfPoints;

    public PlayerVolleyball(String nameOfPlayer, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, "Volleyball", numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }
    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}
