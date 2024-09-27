package abstracta.ejercicio;

import org.w3c.dom.ls.LSOutput;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Hola soy charmander y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy charmander y este es mi ataque pinio de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy charmander y este es mi ataque lanza de llamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy charmander y este es mi ataque ascuas");

    }
}

