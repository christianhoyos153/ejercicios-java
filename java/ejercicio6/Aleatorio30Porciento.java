package resta.aleatorio30porciento;

import java.util.Random;

public class Aleatorio30Porciento {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(201); // 0 a 200
        double aumento = numero * 1.3; // +30%
        System.out.println("numero generado: " + numero);
        System.out.println("aumentado en 30%: " + aumento);
    }
}
