
public class Departamento {
    public String nombre;
    public int numEmpleados;
    public double produccionAnual;
    public  String categoria;

    public Departamento(String nombre, int numEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = calcularCategoria();
    }

    public String calcularCategoria() {
        if (numEmpleados <= 10 && produccionAnual <= 500000) {
            return "C";
        } else if (numEmpleados <= 20 && produccionAnual <= 1000000) {
            return "B";
        } else {
            return "A";
        }
    }
}
