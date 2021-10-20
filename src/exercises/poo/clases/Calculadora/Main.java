package laia.poo.clases.Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero2 = num2.nextDouble();

        Scanner opera = new Scanner(System.in);
        System.out.println("Escoge la operación que quieres realizar: \n 1 (Suma) \n 2 (Resta) \n 3 (Multiplicación) \n 4 (División) \n 5 (Elevado al cuadrado) \n 6 (Módulo) \n 7 (Menor que) \n 8 (Mayor que) \n 9 (Raíz cuadrada) \n 10 (Igual) ");
        int operador = opera.nextInt();

        Operaciones operaciones = new Operaciones(numero1, numero2);

        switch (operador) {
            case 1 -> System.out.println("La suma es: " + operaciones.resultadoSuma());
            case 2 -> System.out.println("La resta es: " + operaciones.resultadoResta());
            case 3 -> System.out.println("La multiplicación es: " + operaciones.resultadoMulti());
            case 4 -> System.out.println("La división es: " + operaciones.resultadoDiv());
            case 5 -> System.out.println("La elevación es:  " + operaciones.resultadoElevado());
            case 6 -> System.out.println("El modulo es: " + operaciones.resultadoMod());
            case 7 -> System.out.println("El resultado es: " + operaciones.resultadoMenor());
            case 8 -> System.out.println("El resultado es: " + operaciones.resultadoMayor());
            case 9 -> {
                System.out.println("La raíz cuadrada de: " + numero1 + " es " + operaciones.resultadoRai1());
                System.out.println("La raíz cuadrada de: " + numero2 + " es " + operaciones.resultadoRai2());
            }
            case 10 -> System.out.println("El resultado es: " + operaciones.resultadoIgual());
            default -> throw new IllegalStateException("Unexpected value: " + operador);
        }

    }
    }