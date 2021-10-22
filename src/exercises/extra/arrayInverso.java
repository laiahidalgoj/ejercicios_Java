package laia.extra;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class arrayInverso {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce número: ");
            int nums = entrada.nextInt();
            list.add(nums);
        }
        System.out.println(list);

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println(sum);

        // invierte la lista
        Collections.reverse(list);
        System.out.println("Lista invertida: " + list);

    }
}

