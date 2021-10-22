package laia.extra;

public class ForNums {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            System.out.println("Este es el for: " + i);
        }


        String cadena = "hola";
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
        System.out.println(cadena.length());
    }
}