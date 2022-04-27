package PracticaMona;

public class Supportcat extends Mona{
    String aufifonos="grises con negro con microfono incluido";

    public Supportcat(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "Supportcat{" +
                "orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                ", aufifonos='" + aufifonos + '\'' +
                '}';
    }
}
