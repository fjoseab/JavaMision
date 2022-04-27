package PracticaMona;

public class Scarletteocat extends Mona{
    String cabello = "rubio con moño rosa";
    String vestimenta = "traje color rosa y bolso color rosa";

    public Scarletteocat(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "Scarletteocat{" +
                "orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                ", cabello='" + cabello + '\'' +
                ", vestimenta='" + vestimenta + '\'' +
                '}';
    }
}
