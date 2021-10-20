package laia.POO1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Administrador administrador = new Administrador();


        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a la plataforma!");
        System.out.println("1.Registrarte / 2.Iniciar sesión");
        int registroInicio = entrada.nextInt();

        if (registroInicio == 1) {
            Scanner nombre = new Scanner(System.in);
            System.out.println("Introduce tu nombre: ");
            String name = nombre.next();

            Scanner apellidos = new Scanner(System.in);
            System.out.println("Introduce tus apellidos: ");
            String lastName = apellidos.next();

            Scanner fecha = new Scanner(System.in);
            System.out.println("Introduce tu fecha de nacimiento: ");
            String date = fecha.next();

            Scanner correo = new Scanner(System.in);
            System.out.println("Introduce tu email: ");
            String email = correo.next();

            Scanner contra = new Scanner(System.in);
            System.out.println("Introduce un password: ");
            String pass = contra.next();

            Scanner verificaContra = new Scanner(System.in);
            System.out.println("Vuelve a introducir el mismo password: ");
            String VerifyPass = verificaContra.next();

            String VerifyPass2 = null;
            do {
                Scanner verificaContra2 = new Scanner(System.in);
                System.out.println("Vuelve a intentarlo: ");
                VerifyPass2 = verificaContra2.next();
            } while (!(pass.equals(VerifyPass2)));

            System.out.println("Password verificado");

            if (pass.length() <= 4) {
                System.out.println("Nivel de seguridad bajo");
            } else if (pass.length() <= 6) {
                System.out.println("Nivel de seguridad medio");
            }else {
                System.out.println("Nivel de seguridad alto");
            }

            System.out.println(usuario.login());

        }else{
            Scanner perfil = new Scanner(System.in);
            System.out.println("1.Usuario / 2.Administrador");
            int perf = perfil.nextInt();

            if(perf == 1){
                System.out.println(usuario.login());
            }else{
                System.out.println(administrador.login());
            }

            Scanner correo = new Scanner(System.in);
            System.out.println("Introduce tu email: ");
            String email = correo.next();

            Scanner contra = new Scanner(System.in);
            System.out.println("Introduce tu password: ");
            String pass = contra.next();

            System.out.println(usuario.login());

            Scanner salir = new Scanner(System.in);
            System.out.println("Quieres salir? 1.Sí / 2.No");
            int out = salir.nextInt();

            if(out == 1){
                System.out.println(usuario.logout());
            }else{
                System.out.println("¡Perfecto!");
            }

        }
    }
}

