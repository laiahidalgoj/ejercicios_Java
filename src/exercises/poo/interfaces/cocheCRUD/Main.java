package laia.poo.interfaces.cocheCRUD;

import java.util.List;

public class Main {


    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());

    }
}