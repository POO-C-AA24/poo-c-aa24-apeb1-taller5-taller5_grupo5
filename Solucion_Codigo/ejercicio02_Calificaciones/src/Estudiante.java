
public class Estudiante {

    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void agregarMateria(Materia materia) {
        this.materia = materia;
    }

    public void verificarAprobacion() {
        if (materia == null) {
            System.out.println("No hay ninguna materia asignada al estudiante.");
            return;
        }

        double porcentaje = materia.calcularPorcentaje();
        if (porcentaje >= 70) {
            System.out.println("El estudiante " + nombre + " ha aprobado la materia " + materia.getNombre() + " con un porcentaje de " + porcentaje + "%.");
        } else {
            System.out.println("El estudiante " + nombre + " no ha aprobado la materia " + materia.getNombre() + " con un porcentaje de " + porcentaje + "%.");
            System.out.println("Debe rendir un examen de recuperación.");
            double acumulado = (materia.getAcd() + materia.getApe() + materia.getAa()) * 0.6;
            double notaRecuperacionNecesaria = 3.5 - acumulado;
            System.out.println("Debe obtener al menos " + notaRecuperacionNecesaria + " puntos en el examen de recuperación.");
        }
    }
}
