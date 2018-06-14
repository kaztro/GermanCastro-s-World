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
/*
    public int getMoney() {
        return cc.getMoney();
    }

    public int getLife() {
        return cc.getLife();
    }

    public int getMaterials() {
        return cc.getMaterials();
    }

    public int getLevel() {
        return cc.getLevel();
    }

   /* public abstract void giveMoney();
    public abstract void giveLife();
    public abstract void giveMaterials();
    public abstract void giveLevel();*/
}
