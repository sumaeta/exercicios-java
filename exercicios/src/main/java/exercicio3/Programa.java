package exercicio3;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================= Inicio ==============");

        System.out.println("Informe o valor do reajuste: ");
        double reajuste = scanner.nextDouble();

        double valor = (reajuste * 0.01) + reajuste;

        System.out.println("O novo valor será de: " + valor);

        System.out.println("================= Fim ==============");
    }
}
