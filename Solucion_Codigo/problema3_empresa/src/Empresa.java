
import java.util.ArrayList;

public class Empresa {
    public String nombre;
    public String ruc;
    public String direccion;
    public ArrayList<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println("Nombre: " + departamento.nombre);
            System.out.println("Numero de empleados: " + departamento.numEmpleados);
            System.out.println("Produccion anual: " + departamento.produccionAnual);
            System.out.println("Categoria: " + departamento.categoria);
            System.out.println();
        }
    }

}

