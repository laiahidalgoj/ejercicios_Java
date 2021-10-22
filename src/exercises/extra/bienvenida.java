package laia.extra;

import java.util.Scanner;

public class bienvenida {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime cuál es tu nombre");
        String nombre = entrada.next();

        System.out.println("Bienvenida " + nombre);
    }
}


