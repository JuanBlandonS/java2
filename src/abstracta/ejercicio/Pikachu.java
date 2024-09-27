package abstracta.ejercicio;

public class Pikachu extends  Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Hola soy pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy pikachu y este es mi ataque punio de trueno");
    }
}
