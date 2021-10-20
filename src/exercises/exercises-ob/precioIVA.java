package fran;

import java.util.Scanner;

public class precioIVA {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double valor = entrada.nextFloat();

        //esto es el porcentaje del IVA
        double iva = 0.21;

        //esta es la operacion que multiplicamos el input del usuario * el iva que hemos declarado arriba (0.21)
        //el resultado de esto, son los euros que se han de sumar al precio
        double operacion = valor * iva;
        System.out.println(operacion);

        //la suma del resultado que te ha dado la operacion + el precio que te han indicado el usuario.
        double total = operacion + valor;
        System.out.println(total);

    }

}
