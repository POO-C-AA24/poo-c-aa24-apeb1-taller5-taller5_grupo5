
package problema5_sistema_gestion_conflicto;

class Pais {
    private String nombre;
    private boolean esDesarrollado;
    private int poblacion;

    public Pais(String nombre, boolean esDesarrollado, int poblacion) {
        this.nombre = nombre;
        this.esDesarrollado = esDesarrollado;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsDesarrollado() {
        return esDesarrollado;
    }

    public int getPoblacion() {
        return poblacion;
    }
}
