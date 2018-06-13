package CommandCenter;

public class CommandCenter {
    private int life;
    private int level;
    private int money;
    private int materials;

    public void setLife(int life) {
        this.life = life;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMaterials(int materials) {
        this.materials = materials;
    }

    public int getLife() {
        return life;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }

    public int getMaterials() {
        return materials;
    }
}

