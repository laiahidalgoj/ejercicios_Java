package laia.poo.clases.SmartDevice;

public class SmartDevice {

    private double pulgadas;
    private String modelo;
    private String marca;
    private double price;
    private String procesador;
    private String sistOperativo;
    private String memory;
    private boolean bluetooth;

    public SmartDevice(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth) {
        this.pulgadas = pulgadas;
        this.modelo = modelo;
        this.marca = marca;
        this.price = price;
        this.procesador = procesador;
        this.sistOperativo = sistOperativo;
        this.memory = memory;
        this.bluetooth = bluetooth;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrice() {
        return price;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getSistOperativo() {
        return sistOperativo;
    }

    public String getMemory() {
        return memory;
    }
    public boolean getBluetooth(){
        return bluetooth;
    }
}




