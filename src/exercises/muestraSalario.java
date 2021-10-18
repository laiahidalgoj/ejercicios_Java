package laia;

import java.util.Scanner;

public class muestraSalario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.next();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Introduce tu salario: ");
        double salario = entrada2.nextDouble();


        if(edad == 16){
            System.out.println("No tienes edad para trabajar");
        }else if(edad <=19 || edad <=50){
            double porcentaje18 = (salario * 5) / 100;
            double result18 = porcentaje18 + salario;
            System.out.println("Tu salario es de: " + result18);
        }else if(edad <= 51 || edad <= 60){
            double porcentaje50 = (salario * 10) / 100;
            double result50 = porcentaje50 + salario;
            System.out.println("Tu salario es de: " + result50);
        }else{
            double porcentaje60 = (salario * 15) / 100;
            double result60 = porcentaje60 + salario;
            System.out.println("Tu salario es de: " + result60);
        }
    }
}
