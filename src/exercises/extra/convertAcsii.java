package laia.extra;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class convertAcsii {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un carácter");
        String ascii = entrada.next();

        char character = ascii.charAt(0);
        int resultado = (int) character;

        System.out.println(resultado);





    }
}
