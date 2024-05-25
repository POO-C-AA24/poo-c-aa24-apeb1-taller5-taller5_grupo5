
package problema5_sistema_gestion_conflicto;



public class ejecuta {
    public static void main(String[] args) {
        // Crear instancia del sistema de gestión
        SistemaDeGestion sistema = new SistemaDeGestion();

        // Crear países
        Pais pais1 = new Pais("País A", true, 50000000);  // País desarrollado
        Pais pais2 = new Pais("País B", false, 30000000); // País en desarrollo
        Pais pais3 = new Pais("País C", true, 70000000);  // País desarrollado
        Pais pais4 = new Pais("País D", false, 25000000); // País en desarrollo

        // Agregar países al sistema
        sistema.agregarPais(pais1);
        sistema.agregarPais(pais2);
        sistema.agregarPais(pais3);
        sistema.agregarPais(pais4);

        // Crear conflicto
        Conflicto conflicto1 = new Conflicto("Conflicto Internacional X", "2023-01-01", "En curso", "Detalles del conflicto X");

        // Agregar países involucrados al conflicto
        conflicto1.agregarPaisInvolucrado(pais1);
        conflicto1.agregarPaisInvolucrado(pais2);

        // Crear eventos
        Evento evento1 = new Evento("Batalla en la ciudad A", "2023-03-15", "Ciudad A", "Descripción de la batalla", "batalla", conflicto1);
        Evento evento2 = new Evento("Tratado de paz en la ciudad B", "2023-04-10", "Ciudad B", "Descripción del tratado", "tratado de paz", conflicto1);

        // Agregar eventos al conflicto
        conflicto1.agregarEvento(evento1);
        conflicto1.agregarEvento(evento2);

        // Agregar conflicto al sistema
        sistema.agregarConflicto(conflicto1);

        // Verificar estado de los conflictos
        sistema.verificarEstadoConflictos();

        // Mostrar información del conflicto y eventos
        System.out.println("Nombre del Conflicto: " + conflicto1.getNombre());
        System.out.println("Fecha de Inicio: " + conflicto1.getFechaInicio());
        System.out.println("Estado Actual: " + conflicto1.getEstadoActual());
        System.out.println("Detalles: " + conflicto1.getDetallesAdicionales());
        System.out.println("Países Involucrados: ");
        for (Pais pais : conflicto1.getPaisesInvolucrados()) {
            System.out.println("- " + pais.getNombre());
        }
        System.out.println("Eventos: ");
        for (Evento evento : conflicto1.getEventos()) {
            System.out.println("- " + evento.getNombre() + " en " + evento.getUbicacion() + " (" + evento.getTipo() + ")");
        }
    }
}

