package clase.ejercicio2;

public class Estudiante extends Persona {
    private int matricula;
    private double promedio;
    private String licenciatura;

    // Constructor
    public Estudiante(String nombre, int edad, String sexo, int matricula, double promedio, String licenciatura) {
        super(nombre, edad, sexo);  // Llama al constructor de la clase padre
        this.matricula = matricula;
        this.promedio = promedio;
        this.licenciatura = licenciatura;
    }

    // Metodo para mostrar datos del estudiante
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Licenciatura: " + licenciatura);
    }
}

