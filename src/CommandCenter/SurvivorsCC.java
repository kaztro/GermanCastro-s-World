package CommandCenter;

public class SurvivorsCC extends CCBuilder {
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

    /*
    @Override
    public int getMoney() {
        return super.getMoney();
    }

    @Override
    public int getLife() {
        return super.getLife();
    }

    @Override
    public int getMaterials() {
        return super.getMaterials();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }*/
}
