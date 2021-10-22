package laia.extra;

import java.util.Scanner;

public class divisible2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("Este número es divisible entre 2");
        }else{
            System.out.println("Este número no es divisible entre 2");
        }
    }
}
