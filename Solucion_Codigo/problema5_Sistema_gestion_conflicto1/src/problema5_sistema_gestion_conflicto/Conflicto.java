
package problema5_sistema_gestion_conflicto;

import java.util.ArrayList;
import java.util.List;

class Conflicto {
    private String nombre;
    private List<Pais> paisesInvolucrados;
    private String fechaInicio;
    private String estadoActual;
    private String detallesAdicionales;
    private List<Evento> eventos;

    public Conflicto(String nombre, String fechaInicio, String estadoActual, String detallesAdicionales) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
        this.detallesAdicionales = detallesAdicionales;
        this.paisesInvolucrados = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarPaisInvolucrado(Pais pais) {
        this.paisesInvolucrados.add(pais);
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pais> getPaisesInvolucrados() {
        return paisesInvolucrados;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void actualizarEstado() {
        // Lógica para actualizar el estado del conflicto según las reglas especificadas
    }
}
