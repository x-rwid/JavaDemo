package projectoop;

public class Player implements PlayerInfo {
    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;

    public Player(String playerName, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = playerName;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public String getInfo() {
        return "O'yinci: " + nameOfPlayer + ", Sport: " + sportType +
                ", Joylawuv: " + numberPosition + ", Jamoa: " + teamName;
    }

    @Override
    public String getTeamName() {
        return this.teamName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }
    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }
    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
