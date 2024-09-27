package clase.ejercicioClase;

public class Main {
    public static void main(String[] args) {
        // Instanciar objetos de Vehiculo
        Vehiculo objV1 = new Vehiculo();
        objV1.setPlaca("qwe121");
        objV1.setMarca("Nissan March");
        objV1.setModelo("2023");
        objV1.setTipoTrans(true);
        objV1.setCosto(100000000);
        //String miPlaca = objV1.getPlaca();
        System.out.println("La placa es: "+objV1.getPlaca());
        objV1.setMarca("Toyota TXL");
        objV1.comprar("456A","123","30-08-2024");
        System.out.println(objV1.vender(objV1.getPlaca(),objV1.getCosto(),"29-08-2023"));
        // Instanciar otro objeto de vehiculo con el metodo que contiene todos los datos
        Vehiculo ovh1 = new Vehiculo("uyt678","Kia sportage","2023",true,70000000);
        System.out.println("Marca: "+ovh1.getMarca());
        ovh1.comprar("987t","2333","09-10-2024");
        double vlrSale = ovh1.vender(ovh1.getPlaca(),ovh1.getCosto(),"01-01-2024");
        // Instanciar una motocicleta
        Motocicleta moto1 = new Motocicleta("rt56a","Akt","2021",false,12000000,(byte)2);







    }
}