package laia;

import java.util.Scanner;
//le pides un préstamo a un amigo y necesitas calcular cuanto le deberás después de 3 meses. Vas a devolverle el 10%
// de la cantidad restante del préstamo cada mes.
// crea un programa que calcule y genere la cantidad restante después de 3 meses.

public class loanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime cuál es el importe");
        int amount = scanner.nextInt();
        //your code goes here


        for(int i = 3; i > 0; i--){
            amount -= ((10 * amount) / 100 ); // -= porque le restas al mes anterior
        }
        System.out.println(amount);
    }
}
