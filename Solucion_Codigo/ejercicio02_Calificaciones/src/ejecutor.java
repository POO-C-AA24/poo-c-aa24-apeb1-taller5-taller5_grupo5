
import java.util.Scanner;

public class ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);

        System.out.print("Ingrese el nombre de la materia: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombreMateria = scanner.nextLine();

        System.out.print("Ingrese la calificacion ACD: ");
        double acd = scanner.nextDouble();

        System.out.print("Ingrese la calificacion APE: ");
        double ape = scanner.nextDouble();

        System.out.print("Ingrese la calificacion AA: ");
        double aa = scanner.nextDouble();

        Materia materia = new Materia(nombreMateria, acd, ape, aa);

        estudiante.agregarMateria(materia);

        estudiante.verificarAprobacion();
    }

}
