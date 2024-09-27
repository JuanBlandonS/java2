package clase.ejercicioClase;

public class Vehiculo {
    // Definir los atributos
    private String placa;
    private String marca;
    private String modelo;
    private boolean tipoTrans;
    private double costo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, boolean tipoTrans, double costo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoTrans = tipoTrans;
        this.costo = costo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getTipoTrans() {
        return tipoTrans;
    }

    public void setTipoTrans(boolean tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void comprar(String nroChasis, String nroMotor, String fecha){
        System.out.println("El vehículo con chasis "+nroChasis+" se ha comprado correctamente..");
    }

    public double vender(String placa, double costo, String fecha){

        return placa.endsWith("1") ? costo * 90/100 + this.regIva(costo * 90/100) : costo + this.regIva(costo);
    }

    private double regIva(double costo){
        return costo * 19/100;
    }
}
