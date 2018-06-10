package Player;

public class Director {
    private PlayerBuilder playerBuilder;

    public void setPlayerBuilder(PlayerBuilder pb) {
        playerBuilder = pb;
    }

    public Player getPlayer() {
        return playerBuilder.getPlayer();
    }

    public void buildPlayer() {
        playerBuilder.createNewPlayer();
        playerBuilder.buildName();
        playerBuilder.buildEarth();
    }
}
