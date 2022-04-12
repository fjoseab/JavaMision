package Semana1.Miercoles;

import Semana1.Miercoles.Auto;

public class MainAuto {
    public static void main(String[] args) {
        Auto a = new Auto();

        a.setColor("Azul");
        a.setMarca("Ford");
        a.setModelo("SUV");
        a.setTipoEje("AWD");
        a.setTipoMotor("Sobre alimentado");
        a.setAnio(2016);
        a.setNumeroPasajeros(5);
        a.setCaballosFuerza(550);

        System.out.println(a.toString());

    }
}
