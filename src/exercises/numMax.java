package laia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class numMax {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número máximo: ");
        int numMax = entrada.nextInt();

        for (int i = 0; i < numMax; i++) {
            Scanner entrada1 = new Scanner(System.in);
            System.out.println("Introduce un número o escribe 'no' para parar: ");
            String respuesta1 = entrada1.next();
            list.add(respuesta1);

                if(respuesta1.equals("no")){
                    break;
                }else {
                    System.out.println(respuesta1);
                }


            }
        }
    }

