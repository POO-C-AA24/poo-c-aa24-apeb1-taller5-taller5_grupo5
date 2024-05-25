
package problema4_app_de_la.fiscalia;
import java.util.List;
import java.util.ArrayList;

class Caso {
    public String nombreCaso;
    public String fechaInicio;  // Usando String para manejar la fecha
    public String estado;
    public String detalles;
    public  List<Persona> personasImplicadas;

    public Caso(String nombreCaso, String fechaInicio, String detalles) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.estado = "Iniciado";
        this.detalles = detalles;
        this.personasImplicadas = new ArrayList<>();
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public List<Persona> getPersonasImplicadas() {
        return personasImplicadas;
    }

    public void agregarPersonaImplicada(Persona persona) {
        this.personasImplicadas.add(persona);
    }

    // Método para actualizar el estado del caso
    public void actualizarEstado(String fechaActual) {
        long diasTranscurridos = calcularDiasTranscurridos(fechaInicio, fechaActual);
        if (diasTranscurridos > 14) {
            estado = "Urgente";
        } else if (diasTranscurridos > 7) {
            estado = "Alerta";
        }
    }

    // Método auxiliar para calcular los días transcurridos entre dos fechas
    public long calcularDiasTranscurridos(String fechaInicio, String fechaActual) {
        String[] inicio = fechaInicio.split("-");
        String[] actual = fechaActual.split("-");
        int añoInicio = Integer.parseInt(inicio[0]);
        int mesInicio = Integer.parseInt(inicio[1]);
        int diaInicio = Integer.parseInt(inicio[2]);
        int añoActual = Integer.parseInt(actual[0]);
        int mesActual = Integer.parseInt(actual[1]);
        int diaActual = Integer.parseInt(actual[2]);

        int totalDiasInicio = calcularDiasDesdeElInicioDelAño(añoInicio, mesInicio, diaInicio);
        int totalDiasActual = calcularDiasDesdeElInicioDelAño(añoActual, mesActual, diaActual);

        return totalDiasActual - totalDiasInicio + (365 * (añoActual - añoInicio));
    }

    // Método auxiliar para calcular el número de días desde el inicio del año hasta una fecha dada
    public int calcularDiasDesdeElInicioDelAño(int año, int mes, int dia) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esAñoBisiesto(año)) {
            diasPorMes[1] = 29;  // Febrero tiene 29 días en años bisiestos
        }
        int totalDias = 0;
        for (int i = 0; i < mes - 1; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += dia;
        return totalDias;
    }

    // Método auxiliar para determinar si un año es bisiesto
    public boolean esAñoBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
        return false;
    }
}
