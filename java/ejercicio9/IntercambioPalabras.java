package intercambiopalabras;

import java.util.Scanner;

public class IntercambioPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese palabra A: ");
        String a = scanner.nextLine();
        System.out.print("ingrese palabra B: ");
        String b = scanner.nextLine();
        System.out.println("antes: A = " + a + ", B = " + b);
        // Intercambio
        String temp = a;
        a = b;
        b = temp;
        System.out.println("despues: A = " + a + ", B = " + b);
    }
}
