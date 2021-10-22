package laia.extra;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double radio = entrada.nextDouble();

        final double PI = Math.PI;
        double radioElevado = Math.pow(radio,2);
        double operacion = PI * radioElevado;

        System.out.println(operacion);

    }
}
