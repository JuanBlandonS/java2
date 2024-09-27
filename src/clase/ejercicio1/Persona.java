package clase.ejercicio1;

public class Persona {
    private int edad;
    private String nombre;
    private String trabajo;

    public Persona(int edad, String nombre, String trabajo){
        this.edad = edad;
        this.nombre = nombre;
        this.trabajo = trabajo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void mostrarDatos(){
        System.out.println("La edad es: " + edad);
        System.out.println("El nombre es: "+ nombre);
        System.out.println("El trabajo es: "+ trabajo);
    }
}
