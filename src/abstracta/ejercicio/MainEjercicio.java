package abstracta.ejercicio;

public class MainEjercicio {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasor bulbasor = new Bulbasor();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniaso();
        squirtle.atacarIdrobomba();
        charmander.atacarAraniaso();
        charmander.atacarLanzaLlamas();
        bulbasor.atacarAraniaso();
        bulbasor.atacarDrenaje();
        pikachu.atacarAraniaso();
        pikachu.atacarImpacTrueno();

    }
}
