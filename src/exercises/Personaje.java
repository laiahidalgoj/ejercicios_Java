package laia;

import java.util.Scanner;

public class Personaje {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Crea tu personaje...");
        System.out.println("Escoge el nombre de tu personaje: ");
        String nameCharacter = entrada.next();

        int vida = 0;
        int attack = 0;
        int defense = 0;
        int magic = 0;
        int strong = 0;

        int suma = 0;

        while(!(suma == 15)){
            vida = (int) (Math.random() * 3 + 5);
            System.out.println("vida: " + vida);//empieza desde el 3 hasta el 4
            strong = (int) (Math.random() * 4+1);
            System.out.println("strong: " + strong);
            attack = (int) (Math.random() * 4+1);
            System.out.println("attack: " + attack);
            defense = (int) (Math.random() * 4+1);
            System.out.println("defense: " + defense);
            magic = (int) (Math.random() * 4+1);
            System.out.println("magic: " + magic);
            suma = vida + strong + attack + defense + magic;
            System.out.println(suma);
            System.out.println("---------");
        }
        System.out.println("¡Bienvenido al juego, " + nameCharacter + "! Tu personaje empieza con los siguientes puntos \nVida: " + vida + "\nStrong: " + strong + "\nAttack: " + attack + "\nDefense: " + defense + "\nMagic: " + magic);

        }
    }


