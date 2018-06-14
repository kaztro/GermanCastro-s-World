package Estructures.Army;

public class AliensArmy implements Army {
    @Override
    public void GenerateSquad() {
        System.out.println("--Generating squad-- Â¡pam!, Â¡plaf!, Â¡clonc!, Â¡zis, zas!");
    }
    @Override
    public void GenerateSuperSoldier() {
        System.out.println("--Generating SuperSoldier--Â¡buuum!, Â¡pum!, Â¡tric!; Â¡tris!, Â¡plaf!; Â¡clonc! --La base ha sido destruida--");
    }
}
