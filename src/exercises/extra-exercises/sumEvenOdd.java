package laia;//suma los pares e impares hasta un número pedido por teclado

import java.util.Scanner;

public class sumEvenOdd {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Dime un número");
        int resultado = num.nextInt();
        int numOdd = 0;
        int numEven = 0;

        for(int i = 0; i <= resultado; i++){
            if(i % 2 == 0){
                numEven+=i;
            }else{
                numOdd+=i;
            }
        }

        System.out.println("La suma de los núermos pares es: " + numEven);
        System.out.println("La suma de los números impares es: " + numOdd);

    }
}
