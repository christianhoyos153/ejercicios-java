package resta.porcentajehombresmujeres;

import java.util.Scanner;

public class PorcentajeHombresMujeres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese total de hombres: ");
        int hombres = scanner.nextInt();
        System.out.print("Ingrese total de mujeres: ");
        int mujeres = scanner.nextInt();
        int total = hombres + mujeres;

        double porcentajeHombres = (double) hombres / total * 100;
        double porcentajeMujeres = (double) mujeres / total * 100;

        System.out.printf("porcentaje de hombres: %.2f%%\n", porcentajeHombres);
        System.out.printf("porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);
    }
}
