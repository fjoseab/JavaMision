package PracticaMona;

public class OkalEltocat extends Mona{
    String vestimenta = "Traje de superman";

    public OkalEltocat(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "OkalEltocat{" +
                "orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                ", vestimenta='" + vestimenta + '\'' +
                '}';
    }
}
