package clase.examen1;

public class Oficina extends Inmueble { // Profe esta es la clase oficina
    private String salaAsamblea;

    public Oficina(String codigo, String direccion, String telefono, String salaAsamblea) {
        super(codigo, direccion, telefono);
        this.salaAsamblea = salaAsamblea;
    }

    public void instalarInternet() {
        System.out.println("Instalando internet en la oficina con sala de asamblea: " + salaAsamblea);
    }

    public void info() {
        System.out.println("Oficina en " + getDireccion() + " con sala de asamblea: " + salaAsamblea);
    }
}

