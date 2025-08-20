package resta.capitalpais;

import java.util.Scanner;

public class CapitalPais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el pais: ");
        String pais = scanner.nextLine();
        System.out.print("Ingrese la capital: ");
        String capital = scanner.nextLine();
        System.out.println(pais + " es la capital de " + capital);
    }
}
