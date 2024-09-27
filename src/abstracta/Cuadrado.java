//Interfaces se utiliza con iINTERFACE y IMPLEMENTS


package abstracta;

public class Cuadrado implements Figura, Divujable{

    private double lado;

    public Cuadrado(){
    }

    public Cuadrado( double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void divujar() {
        System.out.println("Hola estoy dibujando un cuadradr");
    }
}
