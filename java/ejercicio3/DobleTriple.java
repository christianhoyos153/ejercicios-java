package resta.dobletriple;

import java.util.Scanner;

public class DobleTriple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        double numero = scanner.nextDouble();
        double doble = numero * 2;
        double triple = numero * 3;
        System.out.println("doble: " + doble);
        System.out.println("triple: " + triple);
    }
}



