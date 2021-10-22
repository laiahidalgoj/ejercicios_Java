package laia.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PosNegParImparBucle {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<String> listN = new ArrayList<>();

        while (!(listN.contains("no"))) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int respuesta = entrada.nextInt();
            list.add(respuesta);

            Scanner entrada1 = new Scanner(System.in);
            System.out.println("Quieres introducir más números? (si)  (no)");
            String respuesta1 = entrada1.next();
            listN.add(respuesta1);
            System.out.println(respuesta);
        }
        System.out.println(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);
        }
        System.out.println("La suma es: " + sum);


        int res = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res -= (int) list.get(i);
        }
        System.out.println("La resta es: " + res);


        int mult = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            mult *= (int) list.get(i);
        }
        System.out.println("La multiplicación es: " + mult);

        int div = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            div /= (int) list.get(i);
        }
        System.out.println("La división es: " + div);


        int pares = 0;
        int impares = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }
        }
        System.out.println("Hay " + pares + " pares");
        System.out.println("Hay " + impares + " impares");
    }
}

