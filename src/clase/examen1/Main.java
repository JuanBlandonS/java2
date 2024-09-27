package clase.examen1;

public class Main { // el main con ejemplos y para ejecutarlo tiene que poner el codigo completo para que le de
public static void main(String[] args) {
    Oficina oficina1 = new Oficina("2121", "Calle 64 # 47-121", "604423332", "Sala grande");
    Oficina oficina2 = new Oficina("2322", "Avenida guallaval con la 38", "604273277", "Sala ultra pequeña");
    Casa casa1 = new Casa("C5641", "Calle Secundaria 789 por los molinos", "6364637", 4);
    Casa casa2 = new Casa("C9772", "Avenida Principal 321 en envigado llegando a viva", "43434434327", 2);

    oficina1.radicar(oficina1.getCodigo());
    oficina1.arrendar(oficina1.getCodigo());
    oficina1.instalarInternet();
    oficina1.info();
    System.out.println("-------------------");

    oficina2.radicar(oficina2.getCodigo());
    oficina2.arrendar(oficina2.getCodigo());
    oficina2.instalarInternet();
    oficina2.info();
    System.out.println("-------------------");

    casa1.radicar(casa1.getCodigo());
    casa1.arrendar(casa1.getCodigo());
    casa1.repararJardin();
    casa1.info();
    System.out.println("-------------------");

    casa2.radicar(casa2.getCodigo());
    casa2.arrendar(casa2.getCodigo());
    casa2.repararJardin();
    casa2.info();
    System.out.println("-------------------");
    }
}


