package PracticaMona;

public class SaintNicktocat extends Mona{
    String goro="rojo con blanco";
    String barba="blanca";
    String traje="rojo con las terminaciones blancas";
    public SaintNicktocat(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "SaintNicktocat{" +
                "orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                ", goro='" + goro + '\'' +
                ", barba='" + barba + '\'' +
                ", traje='" + traje + '\'' +
                '}';
    }
}
