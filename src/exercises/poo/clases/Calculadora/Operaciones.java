package laia.poo.clases.Calculadora;

public class Operaciones extends Calculadora {

    // constructor
    public Operaciones() {
    }

    public Operaciones(double numero1, double numero2) {
        super(numero1, numero2);
    }


    double resultadoSuma(){
        return getNumero1() + getNumero2();}


    double resultadoResta(){
        return getNumero1() - getNumero2();
    }

    double resultadoMulti(){
        return getNumero1() * getNumero2();
    }

    double resultadoDiv(){ return getNumero1() / getNumero2(); }

    double resultadoElevado(){
        return Math.pow(getNumero1(), getNumero2());
    }

    double resultadoMod(){
        return getNumero1() % getNumero2();
    }

    boolean resultadoMenor(){
        return getNumero1() < getNumero2();
    }

    boolean resultadoMayor(){
        return getNumero1() > getNumero2();
    }

    double resultadoRai1(){
        return Math.sqrt(getNumero1());
    }

    double resultadoRai2(){
        return Math.sqrt(getNumero2());
    }

    boolean resultadoIgual(){
        return getNumero1() == getNumero2();
    }

}

