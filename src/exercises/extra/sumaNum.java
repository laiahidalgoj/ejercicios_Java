package laia.extra;// Pide dos números por teclado, los suma y muestra el resultado

import java.util.Scanner;

public class sumaNum {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("Dime un número");
        int res1 = num1.nextInt();
        System.out.println("Dime otro número");
        int res2 = num2.nextInt();

        int suma = res1 + res2;
        System.out.println("La suma es de: " + suma);

    }
}
