package clase.examen1;

public class Casa extends Inmueble { // esta es la clase Casa
    private int nroHabitaciones;

    public Casa(String codigo, String direccion, String telefono, int nroHabitaciones) {
        super(codigo, direccion, telefono);
        this.nroHabitaciones = nroHabitaciones;
    }

    public void repararJardin() {
        System.out.println("Reparando el jardín de la casa con " + nroHabitaciones + " habitaciones.");
    }

    public void info() {
        System.out.println("Casa en " + getDireccion() + " con " + nroHabitaciones + " habitaciones.");
    }
}

