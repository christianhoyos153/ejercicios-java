package resta.aleatoriodisminuido;

import java.util.Random;

public class AleatorioDisminuido {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(41) + 10; // 10 a 50
        double disminuido = numero * 0.85; // -15%
        System.out.println("numero generado: " + numero);
        System.out.println("disminuido en 15%: " + disminuido);
    }
}


