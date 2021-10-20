package laia.poo.clases.SmartDevice;

public class Main {

    public static void main(String[] args) {

        SmartWatch smartWatch = new SmartWatch(1.6, "Apple Watch Series 7", "Apple", 459, "Chip S7", "watchOS", "32GB", true);

        SmartPhone smartPhone = new SmartPhone(6.67, "Mi 11i", "Xiaomi", 538.99, "Qualcomm Snapdragon", "MIUI 12, Android 11", "8GB", true, 3, true, "2G,3G,4G,5G");

        smartPhone.mostrarDatos();
        System.out.println("------");
        smartWatch.mostrarDatos();

    }
}
