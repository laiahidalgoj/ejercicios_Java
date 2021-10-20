package laia.poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice{

    public SmartWatch(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth) {
        super(pulgadas, modelo, marca, price, procesador, sistOperativo, memory, bluetooth);
    }


    public void mostrarDatos(){
        System.out.println("Pulgadas: " + getPulgadas() + "\nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nPrice: " + getPrice() + "\nProcesador: " + getProcesador() + "\nSistema Operativo: " + getSistOperativo() + "\nMemoria: " + getMemory() + "\nBluetooth: " + getBluetooth());
    }
}

