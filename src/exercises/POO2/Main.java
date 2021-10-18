package laia.POO2;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Administrador administrador = new Administrador();

        System.out.println(usuario.login());
        System.out.println(administrador.login());

        System.out.println(usuario.logout());
        System.out.println(administrador.login());

        }
    }


