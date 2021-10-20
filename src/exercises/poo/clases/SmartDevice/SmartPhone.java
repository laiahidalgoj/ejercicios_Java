package laia.poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice{

    private int cameras;
    private boolean sim;
    private String networks;

    public SmartPhone(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth, int cameras, boolean sim, String networks) {
        super(pulgadas, modelo, marca, price, procesador, sistOperativo, memory, bluetooth);
        this.cameras = cameras;
        this.sim = sim;
        this.networks = networks;
    }

    private int getCameras() {
        return cameras;
    }

    private boolean getSim(){
        return sim;
    }

    private String getNetwork(){
        return networks;
    }

    public void mostrarDatos() {
        System.out.println("Pulgadas: " + getPulgadas() + "\nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nPrecio: " + getPrice() + "\nProcesador: " + getProcesador() + "\nSistema Operativo: " + getSistOperativo() + "\nMemoria: " + getMemory() + "\nBluetooh: " + getBluetooth() + "\nCámaras: " + getCameras() + "\nSIM: " + getSim() + "\nRedes: " + getNetwork());
    }
}

