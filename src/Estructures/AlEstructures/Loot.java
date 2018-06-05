package Estructures.AlEstructures;

import Estructures.Estructures;

public class Loot implements Estructures {
    @Override
    public void build(){
        System.out.println("--Construyendo maquila futuristas-- Â¡pam!, Â¡plaf!, Â¡clonc!, Â¡zis, zas!");
    }
    @Override
    public void destroy(){
        System.out.println("Â¡buuum!, Â¡pum!, Â¡tric!; Â¡tris!, Â¡plaf!; Â¡clonc! --Tus fuente principal de ingresos ha sido destruida--");
    }
    @Override
    public void doSomething(){
        System.out.println("...");
    }
}
