package List;

import Estructures.Army.AliensArmy;

import java.util.ArrayList;

public class AliensArmyList {
    private ArrayList<AliensArmy> army;

    public AliensArmyList() {
        army = new ArrayList<>();
    }

    public void add() {
        AliensArmy aArmy = new AliensArmy();

        army.add(aArmy);

        //Scanner read = new Scanner(System.in);

        System.out.println("Tu soldado ha sido agregado!");
        aArmy.build();
    }

    public void add(AliensArmy aArmy) throws Exception {
        if(aArmy != null) {
            if (!army.contains(aArmy)){ army.add(aArmy);}
            Exception e = new Exception("You are sending clones!");
            throw e;
        } else{ throw new Exception("You'r sending me phantom soldiers, we can't fight with that!!");}
    }

    public void show() {

    }
}
