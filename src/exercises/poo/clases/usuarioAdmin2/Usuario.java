package laia.POO2;

public class Usuario {

    //atributos

    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String fechaNacimiento;
    private String nivelSeguridad;

    public Usuario(){
        this.nombre = "Laia";
        this.apellidos = "Hidalgo";
        this.email = "laia@hidalgo...";
        this.password = "ElpAssWord@";
        this.fechaNacimiento = "21/02/1992";
        this.nivelSeguridad = "Nivel de seguridad Alto";

    }

    public Usuario(String nombre, String apellidos, String email, String password, String fechaNacimiento, String nivelSeguridad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelSeguridad = nivelSeguridad;
    }

    //métodos
     public String login() {
        return "¡Hola de nuevo " + nombre + " " +  apellidos + "!";
     }

     public String logout(){
        return "¡Hasta pronto " + nombre + " " + apellidos + "!";
     }

}
