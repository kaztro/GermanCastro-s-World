package RacesBuilder;

import java.util.ArrayList;

public class CommandCenter {
    private int life;
    private int level;
    private ArrayList<Integer> recursos = new ArrayList<Integer>();

    public int getLife() {
        return life;
    }

    public ArrayList<Integer> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Integer> recursos) {
        this.recursos = recursos;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

