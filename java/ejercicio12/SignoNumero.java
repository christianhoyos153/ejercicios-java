package resta.signonumero;

import java.util.Scanner;

public class SignoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 8) {
            System.out.println("positivo");
        } else if (numero < 8) {
            System.out.println("negativo");
        } else {
            System.out.println("nulo");
        }
    }
}
