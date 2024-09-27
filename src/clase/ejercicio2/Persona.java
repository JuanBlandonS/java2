package clase.ejercicio2;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String sexo;

    // Constructor
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Metodo para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
}
