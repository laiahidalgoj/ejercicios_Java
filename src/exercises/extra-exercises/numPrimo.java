package laia;// Pedir un número, comprobar si es primo y preguntar si quiere introducir más
import java.util.Scanner;

public class numPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean primo = true;
        String respuesta, s, S;

        do {
            System.out.println("Introduce un número");
            int resultado = teclado.nextInt();

            for (int i = 2; i < resultado; i++) {
                if (resultado % i == 0) {
                    primo = false;
                }
            }
            if (primo == true) {
                System.out.println(resultado + " es un número primo");
            } else {
                System.out.println(resultado + " no es un número primo");
            }
        System.out.println("Quieres introducir otro número? s/n");
        respuesta = teclado.next();
    }while(respuesta.equals("s") || respuesta.equals("S"));
}
}
