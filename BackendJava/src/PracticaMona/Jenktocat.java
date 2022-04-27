package PracticaMona;

public class Jenktocat extends Mona{
    String vestimenta="camisa blanca con saco azul y pantalon gris";

    public Jenktocat(String orejas, String cabeza, String tentaculos) {
        super(orejas, cabeza, tentaculos);
    }

    @Override
    public String toString() {
        return "Jenktocat{" +
                "vestimenta='" + vestimenta + '\'' +
                ", orejas='" + orejas + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", tentaculos='" + tentaculos + '\'' +
                '}';
    }
}
