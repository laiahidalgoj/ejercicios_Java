package laia.poo.interfaces.cocheCRUD;

import java.util.List;

public class Coche{

    String matricula;
    double price;
    String color;
    String modelo;

    public Coche(){
    }

    public Coche(String matricula, double price, String color, String modelo){
        this.matricula = matricula;
        this.price = price;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
