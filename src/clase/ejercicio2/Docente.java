package clase.ejercicio2;

public class Docente extends Persona {
    private int idTrabajador;
    private double salario;
    private String departamento;

    // Constructor
    public Docente(String nombre, int edad, String sexo, int idTrabajador, double salario, String departamento) {
        super(nombre, edad, sexo);  // Llama al constructor de la clase padre
        this.idTrabajador = idTrabajador;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Metodo para mostrar datos del docente
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Trabajador: " + idTrabajador);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
