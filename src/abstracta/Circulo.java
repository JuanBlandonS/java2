//Interfaces se utiliza con INTERFACE y IMPLEMENTS

package abstracta;

public class Circulo implements Figura, Rotable, Divujable{

    private double radio;

    public Circulo(){
    }

    public Circulo( double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

    @Override
    public void divujar() {
        System.out.println("Hola estoy dibujando un sirculo");
    }
}
