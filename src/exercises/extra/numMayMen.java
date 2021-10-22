package laia.extra;// Pide 2 números y muestra cual es el mayor, el menor, o si son iguales

import java.util.Scanner;
public class numMayMen {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("Dime un número");
        int resultado1 = num1.nextInt();
        System.out.println("Dime un número");
        int resultado2 = num2.nextInt();

        if(resultado1 < resultado2){
            System.out.println("El " + resultado1 + " es menor que " + resultado2);
        }else if(resultado2 < resultado1){
            System.out.println("El " + resultado2 + " es menor que " + resultado1);
        }else{
            System.out.println("Son números iguales");
        }




    }
}
