package PracticaComic;


public class Comic {
    String nombre, capitulo, idioma, editorial;
    int numeroPaginas, tomo;

    public Comic(String nombre, String capitulo, String idioma, String editorial, int numeroPaginas, int tomo) {
        this.nombre = nombre;
        this.capitulo = capitulo;
        this.idioma = idioma;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.tomo = tomo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getTomo() {
        return tomo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTomo(int tomo) {
        this.tomo = tomo;
    }

    @Override
    public String toString() {
        return "PracticaComic.Comic{" +
                "nombre='" + nombre + '\'' +
                ", capitulo='" + capitulo + '\'' +
                ", idioma='" + idioma + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", tomo=" + tomo +
                '}';
    }
}
