package promediotresnumeros;

import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int b = scanner.nextInt();
        System.out.print("ingrese el tercer numero: ");
        int c = scanner.nextInt();
        double promedio = (a + b + c) / 3.0;
        System.out.println("el promedio es: " + promedio);
    }
}
