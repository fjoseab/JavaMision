package Semana1.Viernes;

public class MainAuto {
    public static void main(String[] args) {
        crearObjetos();
    }
    public static void crearObjetos(){
        Auto a=new Auto();
        a.setColor("Azul");
        a.setMarca("Ford");
        a.setModelo("SUV");
        a.setTipoEje("AWD");
        a.setTipoMotor("Sobre alimentado");
        a.setAnio(2016);
        a.setNumeroPasajeros(5);
        a.setCaballosFuerza(550);
        System.out.println(a.toString());

        Auto b=new Auto("Gris","Honda","Deportivo",4);
        System.out.println(b.toString());

        Auto c=new Auto("Azul","Ford","SUV","AWD","Sobre alimentado",2016,5,550);
        System.out.println(c.toString());
    }
}
