package umg.demostracion;

import personajes.Jedi;
import personajes.Personaje;
import personajes.Sith;

public class Main {
    public static void main(String[]args){

        Personaje luke = new Jedi("Luke Skywalker");
        luke.usarFuerza();

        Personaje vader = new Sith("Barth Vader");
        vader.usarFuerza();
    }
}