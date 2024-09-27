package clase.examen1;

public class Inmueble { //Profe esta es la clase Inmueble
    private String codigo;
    private String direccion;
    private String telefono;

    public Inmueble(String codigo, String direccion, String telefono) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void radicar(String codigo) {
        System.out.println("Radicando el inmueble con código: " + codigo);
    }

    public void arrendar(String codigo) {
        System.out.println("Arrendando el inmueble con código: " + codigo);
    }
}


