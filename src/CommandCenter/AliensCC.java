package CommandCenter;

public class AliensCC extends CCBuilder {

    @Override
    public void buildLife() { cc.setLife(100); }

    @Override
    public void buildLevel() { cc.setLevel(0); }

    @Override
    public void buildMoney() { cc.setMoney(100); }

    @Override
    public void buildMaterials() { cc.setMaterials(400); }

    @Override
    public void createNewCommandCenter() {
        super.createNewCommandCenter();
    }

}

