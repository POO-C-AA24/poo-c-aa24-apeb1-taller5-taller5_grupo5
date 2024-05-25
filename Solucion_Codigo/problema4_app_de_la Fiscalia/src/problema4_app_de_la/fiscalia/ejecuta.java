
package problema4_app_de_la.fiscalia;

public class ejecuta {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan Suares", 45, "Ingeniero", "acusado");
        persona1.setTotalDañoEconomico(10000.0);
        persona1.setColaboracion(true);

        Persona persona2 = new Persona("Dario Lopez", 37, "Contadora", "testigo");

        // Creación de un caso
        Caso caso1 = new Caso("Caso de Corrupcion A", "2024-05-01", "Detalles del caso A");

        // Agregar personas al caso
        caso1.agregarPersonaImplicada(persona1);
        caso1.agregarPersonaImplicada(persona2);

        // Actualizar estado del caso
        caso1.actualizarEstado("2024-05-21");

        // Mostrar información del caso
        System.out.println("Nombre del Caso: " + caso1.getNombreCaso());
        System.out.println("Fecha de Inicio: " + caso1.getFechaInicio());
        System.out.println("Estado del Caso: " + caso1.getEstado());
        System.out.println("Detalles: " + caso1.getDetalles());
        System.out.println("Personas Implicadas: ");
        for (Persona persona : caso1.getPersonasImplicadas()) {
            System.out.println("- " + persona.getNombre() + " (" + persona.getNivelImplicacion() + ")");
        }

        // Calcular y mostrar fianza para un acusado colaborador
        if (persona1.getNivelImplicacion().equalsIgnoreCase("acusado") && persona1.isColaboracion()) {
            System.out.println("Fianza para " + persona1.getNombre() + ": " + persona1.calcularFianza());
        }
    }
    
}
