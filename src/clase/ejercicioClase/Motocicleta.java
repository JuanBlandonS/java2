package clase.ejercicioClase;

public class Motocicleta extends Vehiculo {
    private byte nrotiempos;

    public Motocicleta() {
    }

    public Motocicleta(String placa, String marca, String modelo, boolean tipoTrans, double costo, byte nrotiempos) {
        super(placa, marca, modelo, tipoTrans, costo);
        this.nrotiempos = nrotiempos;
    }

    public byte getNrotiempos() {
        return nrotiempos;
    }

    public void setNrotiempos(byte nrotiempos) {
        this.nrotiempos = nrotiempos;
    }

    public double aplicarDesc(double costo, float porc){
        return costo  * porc/100;
    }
}
