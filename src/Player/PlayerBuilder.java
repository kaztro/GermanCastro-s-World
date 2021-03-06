package Player;

public abstract class PlayerBuilder {
    protected Player player;

    public Player getPlayer() {
        return player;
    }

    public void createNewPlayer() {
        player = new Player();
    }

    public abstract void buildName();

    public abstract void buildEarth();

    public String givePlayerName() {
        return player.getName();
    }

    public String giveRaceName() {
        return player.getRacename();
    }

}
