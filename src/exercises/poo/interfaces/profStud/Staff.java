package laia.poo.interfaces.profStud;

public class Staff implements Datos {

    public String name;
    public String lastName;
    public boolean accessAdmin;


    public Staff(){
        name = "Clara";
        lastName = "Sanchez";
        accessAdmin = true;

    }

    @Override
    public void mostrarDatos() {
        System.out.println("The Staff " + name + " " + lastName + "\n · Access to admin: " + accessAdmin + "\n------");

    }
}
