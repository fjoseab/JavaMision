package PracticaMona;

public class Bouncer extends Mona{
    String lentes = "scuros en los ojos";
    String playera = "ajustada";

    public Bouncer(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "Bouncer{" +
                "lentes='" + lentes + '\'' +
                ", playera='" + playera + '\'' +
                ", orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                '}';
    }
}
