
package problema4_app_de_la.fiscalia;
class Persona {
    public String nombre;
    public int edad;
    public String ocupacion;
    public String nivelImplicacion;
    public boolean colaboracion;
    public double totalDañoEconomico;

    public Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colaboracion = false;
        this.totalDañoEconomico = 0.0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public void setNivelImplicacion(String nivelImplicacion) {
        this.nivelImplicacion = nivelImplicacion;
    }

    public boolean isColaboracion() {
        return colaboracion;
    }

    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    public double getTotalDañoEconomico() {
        return totalDañoEconomico;
    }

    public void setTotalDañoEconomico(double totalDañoEconomico) {
        this.totalDañoEconomico = totalDañoEconomico;
    }

    // Método para calcular la fianza
    public double calcularFianza() {
        if (colaboracion && "acusado".equalsIgnoreCase(nivelImplicacion)) {
            return totalDañoEconomico * 0.5;
        }
        return 0.0;
    }
}
