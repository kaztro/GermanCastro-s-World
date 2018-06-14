package CommandCenter;

public class CCDirector {
    private CCBuilder cCBuilder;

    public void setCCBuilder(CCBuilder ccb) { cCBuilder = ccb; }

    public CommandCenter getCommandCenter() {
        return cCBuilder.getCommandCenter();
    }

    //public CommandCenter getCommandCenter() {return cCBuilder.getCommandCenter();}

    public void buildCommandCenter() {
        cCBuilder.createNewCommandCenter();
        cCBuilder.buildLife();
        cCBuilder.buildLevel();
        cCBuilder.buildMoney();
        cCBuilder.buildMaterials();
    }


    /*
    public void getCommandCenter() {
        cCBuilder.getLevel();
        cCBuilder.getLife();
        cCBuilder.getMaterials();
        cCBuilder.getMoney();
    }*/
}
