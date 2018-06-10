package CommandCenter;

public abstract class CCBuilder {
    protected CommandCenter cc;

    public CommandCenter getCommandCenter() {return cc;}

    public void createNewCommandCenter() {
        cc = new CommandCenter();
    }

    public abstract void buildLife();
    public abstract void buildLevel();
    public abstract void buildMoney();
    public abstract void buildMaterials();
}
