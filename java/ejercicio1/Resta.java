package resta.resta;

import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resta = num1 - num2;
        System.out.println("La resta es: " + resta);
    }
}