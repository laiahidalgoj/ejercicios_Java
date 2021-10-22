package laia.extra;// Pide un número y muestra si es positivo o negativo y si es par o impar
import java.util.Scanner;
public class PosNegParImpar {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Dime el número que tú quieras");
        int resultado = num.nextInt();

        if (resultado < 0 && resultado % 2 == 0) {
            System.out.println("El " + resultado + " es un número negativo y un número par");
        } else if (resultado < 0 && resultado % 2 != 0) {
            System.out.println("El " + resultado + " es un número negativo y un número impar");
        } else if (resultado > 0 && resultado % 2 == 0) {
            System.out.println("El " + resultado + " es un número positivo y un número par");
        } else if (resultado > 0 && resultado % 2 != 0)
            System.out.println("El " + resultado + " es un número positivo y un número impar");
    }
}
