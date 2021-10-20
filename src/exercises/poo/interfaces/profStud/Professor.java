package laia.poo.interfaces.profStud;

public class Professor implements Datos {

    public String name;
    public String lastName;
    public boolean accessAdmin;

    public Professor(){
        name = "Alejandra";
        lastName = "Garcia";
        accessAdmin = true;
    }


    @Override
    public void mostrarDatos() {
        System.out.println("The professor " + name + " " + lastName + "\n · Access to admin: " + accessAdmin + "\n------");

    }
}
