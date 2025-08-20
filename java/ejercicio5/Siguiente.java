package resta.siguiente;

import java.util.Scanner;

public class Siguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        int siguiente = numero + 1;
        System.out.println("el numero siguiente es: " + siguiente);
    }
}

 
