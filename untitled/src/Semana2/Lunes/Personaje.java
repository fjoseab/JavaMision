package Semana2.Lunes;

abstract class Sombra{
    abstract void dibujarSombra();

}
class Arma extends Sombra{

    @Override
    void dibujarSombra() {
        System.out.println("Dibujando sombra del arma");
    }
}

public class Personaje extends  Arma {
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();
        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Dibujando sombra");
    }
}
