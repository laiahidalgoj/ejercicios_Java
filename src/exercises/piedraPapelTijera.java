package laia;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class piedraPapelTijera {

    public static void main(String[] args) {

        int contPC = 0;
        int contJugador = 0;

        while(contPC != 3 && contJugador != 3){
            int PC = (int) (Math.random() * 3 + 1);
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escoge 1-Piedra, 2-Papel, 3-Tijera");
            int Jugador = entrada.nextInt();
                if((Jugador == 1 && PC == 2) || (Jugador == 2 && PC == 1) || (Jugador == 3 && PC == 2)){
                    contJugador += 1;
                    System.out.println("Tú ganas! LLevas ganadas.. " +  contJugador);
                }else if((PC == 1 && Jugador == 2) || (PC == 2 && Jugador == 1) || (PC == 3 && Jugador == 2)){
                    contPC += 1;
                    System.out.println("Te ha ganado una máquina, llevo ganadas.. " +  contPC);
                }else{
                    System.out.println("Habéis empatado! Juega otra vez");
                }
        }
        if (contPC == 3){
            System.out.println("La máquina ha ganado la partida!!");
        }else{
            System.out.println("Has ganado la partida!!");
        }

    }
}


