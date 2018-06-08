package CommandCenter;

public abstract class CCBuilder {
    protected CommandCenter cc;

    public CommandCenter getCommandCenter() {return cc;}

    public abstract void buildLife();
    public abstract void buildLevel();
    public abstract void buildMoney();

    //public abstract void buildEnergy();
    public abstract void buildMaterials();
}
