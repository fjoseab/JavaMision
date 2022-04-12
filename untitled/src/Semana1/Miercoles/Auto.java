package Semana1.Miercoles;

public class Auto {
    //Variables
    String color, marca, modelo, tipoEje, tipoMotor;
    int anio, numeroPasajeros;
    float caballosFuerza;

    //Get
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoEje() {
        return tipoEje;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getAnio() {
        return anio;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public float getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Set
    public boolean setMarca(String marca) {
        if(!marca.isEmpty()){
            this.marca = marca;
            return true;
        }else
            return false;
    }

    public boolean setModelo(String modelo) {
        if (!modelo.isEmpty()){
            this.modelo = modelo;
            return true;
        }else
            return false;
    }

    public boolean setTipoEje(String tipoEje) {
        if (!tipoEje.isEmpty()){
            this.tipoEje = tipoEje;
            return true;
        }else
            return false;
    }

    public boolean setTipoMotor(String tipoMotor) {
        if (!tipoMotor.isEmpty()){
            this.tipoMotor = tipoMotor;
            return true;
        }else
            return false;
    }

    public boolean setAnio(int anio) {
        if(anio>=1886&&anio<=2024) {
            this.anio = anio;
            return true;
        }else
            return false;
    }

    public boolean setNumeroPasajeros(int numeroPasajeros) {
        if (numeroPasajeros>=1){
            this.numeroPasajeros = numeroPasajeros;
            return true;
        }else
            return false;
    }

    public boolean setCaballosFuerza(float caballosFuerza) {
        if (caballosFuerza>=1){
            this.caballosFuerza = caballosFuerza;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoEje='" + tipoEje + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", anio=" + anio +
                ", numeroPasajeros=" + numeroPasajeros +
                ", caballosFuerza=" + caballosFuerza +
                '}';
    }
}
