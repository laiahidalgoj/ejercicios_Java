package laia.POO2;

public class Administrador {

    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String fechaNacimiento;
    private String nivelSeguridad;


    public Administrador(){
        this.nombre = "SuperAdmin";
        this.apellidos = "admin";
        this.email = "admin@super...";
        this.password = "ElPasSAdmin-";
        this.nivelSeguridad = "Nivel de seguridad alto";

    }

    public Administrador(String nombre, String apellidos, String email, String password, String fechaNacimiento, String nivelSeguridad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelSeguridad = nivelSeguridad;
    }

    //métodos
    public String login() {
        return "¡Hola de nuevo " + nombre +"!";
    }

    public String logout(){
        return "¡Hasta pronto " +  nombre + "!";
    }
}
