
public class Materia {

    private String nombre;
    private double acd; // Calificación ACD
    private double ape; // Calificación APE
    private double aa;  // Calificación AA

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAcd() {
        return acd;
    }

    public double getApe() {
        return ape;
    }

    public double getAa() {
        return aa;
    }

    public double calcularPorcentaje() {
        return (acd + ape + aa) / 10 * 100;
    }
}
