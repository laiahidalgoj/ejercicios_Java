package laia.poo.interfaces.profStud;

public class Student implements Datos {

    public String name;
    public String lastName;
    public String level;
    public boolean accessAdmin;
    public int certifications;


    public Student(){
        name = "Laia";
        lastName = "Hidalgo";
        level = "intermediate";
        accessAdmin = false;
        certifications = 5;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("The student " + name + " " + lastName + " have a level " + level + "\n · Level: " + level + "\n · Access to admin: " + accessAdmin + "\n · Certifications: " +  certifications + "\n------");
    }
}
