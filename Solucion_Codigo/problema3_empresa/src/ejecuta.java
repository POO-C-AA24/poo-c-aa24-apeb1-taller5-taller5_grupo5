
public class ejecuta {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa XYZ", "1234567890", "Dirección de la empresa");

        Departamento departamento1 = new Departamento("Departamento 1", 15, 800000);
        Departamento departamento2 = new Departamento("Departamento 2", 25, 1500000);
        Departamento departamento3 = new Departamento("Departamento 3", 7, 300000);

        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);
        empresa.agregarDepartamento(departamento3);
        empresa.mostrarDepartamentos();
    }
}