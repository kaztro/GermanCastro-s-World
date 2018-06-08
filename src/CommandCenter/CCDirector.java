package CommandCenter;

public class CCDirector {
    private CCBuilder cCBuilder;

    public void setCCBuilder(CCBuilder ccb) { cCBuilder = ccb; }

    public CommandCenter getCommandCenter() {return cCBuilder.getCommandCenter();}

    public void buildCommandCenter() {
        cCBuilder.buildLife();
        cCBuilder.buildLevel();
        cCBuilder.buildMoney();
        //cCBuilder.buildEnergy();
        cCBuilder.buildMaterials();

    }
}
