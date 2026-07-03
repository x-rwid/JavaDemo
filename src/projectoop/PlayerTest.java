package projectoop;

public class PlayerTest {
    static void main() {

        IO.println("--- Sport Tizimi ---\n");

        PlayerGoalKeeper keeper = new PlayerGoalKeeper(
                "Iker Casillas",
                1,
                "Real Madrid FC",
                0,
                4,
                0,
                264
        );

        PlayerSetter setter = new PlayerSetter(
                "Maja Ognjenovic",
                10,
                "Savino Del Bene",
                10,
                248
        );

        PlayerPointGuard guard = new PlayerPointGuard(
                "Kareem AbdulJabbar",
                33,
                "Los Angeles Lakers",
                10031,
                24176
        );

        PlayerInfo[] players = {keeper, setter, guard};

        for (PlayerInfo player : players) {
            IO.println("Jamoa: " + player.getTeamName());
            IO.println("Tafsilatlar: " + player.getInfo());
            IO.println("------------------------------------------------");
        }

        IO.println("\n--- Ma'lumatlar ---");

        IO.println(keeper.getNameOfPlayer() + " toza o'yinlari: " + keeper.getCountOfSaves());
        IO.println(setter.getNameOfPlayer() + " uzatmalari: " + setter.getCountOfSets());
        IO.println(guard.getNameOfPlayer() + " point'lari: " + guard.getCountOfGuard());
    }
}
