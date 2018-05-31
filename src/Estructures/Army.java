package Estructures;

public class Army implements Estructures {
    @Override
    public void build(){
        System.out.println("--Construyendo base-- Â¡pam!, Â¡plaf!, Â¡clonc!, Â¡zis, zas!");
    }
    @Override
    public void destroy(){
        System.out.println("Â¡buuum!, Â¡pum!, Â¡tric!; Â¡tris!, Â¡plaf!; Â¡clonc! --La base ha sido destruida--");
    }
    @Override
    public void doSomething(){
        System.out.println("...");
    }
}
