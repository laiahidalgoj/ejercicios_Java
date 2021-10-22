package laia.extra;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class cincoNums {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>(5);



        for(int i = 0; i < 5; i++){
            Scanner num = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int resultado = num.nextInt();
            numeros.add(resultado);
            System.out.println(numeros);
        }

        String lista = numeros.toString();
        System.out.println(lista);

    }

}

