package resta.cuadradocubo;

import java.util.Scanner;

public class CuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        double numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        double cubo = numero * numero * numero;
        System.out.println("cuadrado: " + cuadrado);
        System.out.println("cubo: " + cubo);
    }
}