package Estructures.Army;

public class AliensArmy implements Army {
    @Override
    public void GenerateSquad() {
        System.out.println("--Generando escuadron-- Â¡pam!, Â¡plaf!, Â¡clonc!, Â¡zis, zas!");
    }
    @Override
    public void GenerateSuperSoldier() {
        System.out.println("Â¡buuum!, Â¡pum!, Â¡tric!; Â¡tris!, Â¡plaf!; Â¡clonc! --La base ha sido destruida--");
    }
}
