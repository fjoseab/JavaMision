package PracticaHarry;

public class Main {
    public static void main(String[] args) {

        //Por medio de Setters
        //Personaje 1
        Personaje personaje1 = new Personaje();
        personaje1.setCasa("");
        personaje1.setGenero("");
        personaje1.setNombre("");
        personaje1.setBoggart("");
        personaje1.setPatronus("");
        //Personaje 2
        Personaje personaje2 = new Personaje();
        personaje2.setCasa("");
        personaje2.setGenero("");
        personaje2.setNombre("");
        personaje2.setBoggart("");
        personaje2.setPatronus("");

        //Por Constructor
        Personaje personaje3= new Personaje("","","","","");
        Personaje personaje4= new Personaje("","","","","");
        Personaje personaje5= new Personaje("","","","","");

        System.out.println(personaje1.toString());
        System.out.println(personaje2.toString());
        System.out.println(personaje3.toString());
        System.out.println(personaje4.toString());
        System.out.println(personaje5.toString());
    }
}
