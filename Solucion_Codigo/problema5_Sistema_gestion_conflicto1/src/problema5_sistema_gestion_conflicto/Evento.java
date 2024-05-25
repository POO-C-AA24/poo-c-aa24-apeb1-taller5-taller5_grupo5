
package problema5_sistema_gestion_conflicto;

class Evento {
    private String nombre;
    private String fecha;
    private String ubicacion;
    private String descripcion;
    private Conflicto conflicto;
    private String tipo; // batalla, tratado de paz, reunión diplomática, etc.
    private boolean usaArmasNucleares;
    private int bajas;

    public Evento(String nombre, String fecha, String ubicacion, String descripcion, String tipo, Conflicto conflicto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.conflicto = conflicto;
        this.usaArmasNucleares = false;
        this.bajas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isUsaArmasNucleares() {
        return usaArmasNucleares;
    }

    public void setUsaArmasNucleares(boolean usaArmasNucleares) {
        this.usaArmasNucleares = usaArmasNucleares;
    }

    public int getBajas() {
        return bajas;
    }

    public void setBajas(int bajas) {
        this.bajas = bajas;
    }

    public void actualizarEvento(String fecha, String ubicacion, String descripcion, boolean usaArmasNucleares, int bajas) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.usaArmasNucleares = usaArmasNucleares;
        this.bajas = bajas;
    }
}
