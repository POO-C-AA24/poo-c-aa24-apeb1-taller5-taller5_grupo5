
package problema5_sistema_gestion_conflicto;

import java.util.ArrayList;
import java.util.List;

class SistemaDeGestion {
    private List<Conflicto> conflictos;
    private List<Pais> paisesDelMundo;

    public SistemaDeGestion() {
        this.conflictos = new ArrayList<>();
        this.paisesDelMundo = new ArrayList<>();
    }

    public void agregarConflicto(Conflicto conflicto) {
        this.conflictos.add(conflicto);
    }

    public void agregarPais(Pais pais) {
        this.paisesDelMundo.add(pais);
    }

    public List<Conflicto> getConflictos() {
        return conflictos;
    }

    public void verificarEstadoConflictos() {
        int totalPaises = paisesDelMundo.size();
        int totalPaisesDesarrollados = (int) paisesDelMundo.stream().filter(Pais::isEsDesarrollado).count();

        for (Conflicto conflicto : conflictos) {
            int paisesEnBatalla = (int) conflicto.getEventos().stream().filter(evento -> "batalla".equalsIgnoreCase(evento.getTipo())).count();
            int paisesDesarrolladosEnBatalla = (int) conflicto.getEventos().stream().filter(evento -> "batalla".equalsIgnoreCase(evento.getTipo()) && evento.isUsaArmasNucleares()).count();
            
            if (paisesEnBatalla > totalPaises * 0.5 || (paisesDesarrolladosEnBatalla > 0 && paisesEnBatalla > totalPaisesDesarrollados * 0.3)) {
                conflicto.setEstadoActual("Guerra mundial");
            } else if (paisesEnBatalla > totalPaises * 0.3) {
                System.out.println("Convocar a la ONU a reunión urgente por conflicto: " + conflicto.getNombre());
            }
            
            for (Evento evento : conflicto.getEventos()) {
                for (Pais pais : conflicto.getPaisesInvolucrados()) {
                    if (evento.getBajas() >= pais.getPoblacion() * 0.5) {
                        System.out.println("Convocar a la ONU a reunión urgente por altas bajas en el país: " + pais.getNombre());
                    }
                }
            }
        }
    }
}

