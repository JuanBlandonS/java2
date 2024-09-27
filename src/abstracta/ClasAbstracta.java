package abstracta;

public class ClasAbstracta {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(21);
        Circulo circulo = new Circulo(3.5);

        System.out.println(cuadrado.calcularArea());
        cuadrado.divujar();
        System.out.println(circulo.calcularArea());
        circulo.rotar();
        circulo.divujar();


    }
}
