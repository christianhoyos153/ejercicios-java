package resta.divisibilidad;

import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero (divisor): ");
        int divisor = scanner.nextInt();
        System.out.print("ingrese el segundo numero (dividendo): ");
        int dividendo = scanner.nextInt();

        if (dividendo % divisor == 0) {
            System.out.println("es divisible");
        } else {
            System.out.println("no es divisible");
        }
    }
}