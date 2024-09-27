package clase.ejercicio2;

public class main {
    public static void main(String[] args) {
        // Crear un objeto de Estudiante
        Estudiante estudiante = new Estudiante("Juan", 20, "Masculino", 12345, 9.5, "Ingeniería de Sistemas");

        // Crear un objeto de Docente
        Docente docente = new Docente("María", 35, "Femenino", 9876, 2500.75, "Ciencias Sociales");

        // Mostrar datos del estudiante
        System.out.println("Datos del Estudiante:");
        estudiante.mostrarDatos();

        System.out.println();  // Separador entre las salidas

        // Mostrar datos del docente
        System.out.println("Datos del Docente:");
        docente.mostrarDatos();
    }
}

