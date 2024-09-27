package abstracta.ejercicio;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Hola soy squirtle y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarIdrobomba() {
        System.out.println("Hola soy squirtle y este es mi ataque de idro bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy squirtle y este es mi ataque burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy squirtle y este es mi ataque pistola de agua");
    }
}
