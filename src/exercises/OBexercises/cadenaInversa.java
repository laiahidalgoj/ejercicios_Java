package laia.OBexercises;

public class cadenaInversa {

    public static void main(String[] args) {

        String texto = "hola mundo";
        System.out.println(reverse(texto));

    }

    public static String reverse(String texto) {
        StringBuilder str = new StringBuilder(texto);
        texto = str.reverse().toString();
        return texto;
    }
}
