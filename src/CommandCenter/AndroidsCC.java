package CommandCenter;

public class AndroidsCC extends CCBuilder {
    public AndroidsCC() { super.cc = new CommandCenter(); }

    public void buildLife() { cc.setLife(100); }

    public void buildLevel() { cc.setLevel(0); }

    public void buildMoney() { cc.setMoney(100); }

    //public void buildEnergy() { cc.setEnergy(500); }

    public void buildMaterials() { cc.setMaterials(400); }
}
