package practicaMultiverse;

public class HombreAraña {
    String nombre;
    String alias;
    String estado;
    String descripcion;
    String aparece;

    public HombreAraña(String nombre, String alias, String estado, String descripcion, String aparece) {
        this.nombre = nombre;
        this.alias = alias;
        this.estado = estado;
        this.descripcion = descripcion;
        this.aparece = aparece;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getaparece() {
        return aparece;
    }

    public void setaparece(String appearedIn) {
        this.aparece = appearedIn;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", appearedIn='" + aparece + '\'';
    }
}
