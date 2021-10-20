package laia.poo.interfaces.profStud;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Professor professor = new Professor();
        Staff staff = new Staff();

        ArrayList<Datos> datos = new ArrayList<Datos>();

        datos.add(professor);
        datos.add(staff);
        datos.add(student);

          mostrarDatos(datos);

        }

    public static void mostrarDatos(ArrayList<Datos> datos){
        for(Datos dato : datos){
            dato.mostrarDatos();
        }
    }
}
