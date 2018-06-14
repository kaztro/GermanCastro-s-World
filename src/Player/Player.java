package Player;

import RacesBuilder.Earth;

public class Player {
    private String name;
    private Earth race;
    private String racename;

    /* private int money;
     private int materials;
     private int Life;
     private int Level;
 */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Earth getRace() {
        return race;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }

    public String getRacename() {
        return racename;
    }
/*
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMaterials() {
        return materials;
    }

    public void setMaterials(int materials) {
        this.materials = materials;
    }

    public int getLife() {
        return Life;
    }

    public void setLife(int life) {
        Life = life;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }*/
}

