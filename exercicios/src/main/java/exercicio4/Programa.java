package exercicio4;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================= Inicio =================");

        System.out.println("Valor da peça: ");
        double peca = scanner.nextDouble();

        System.out.println("Quantidade: ");
        double quant = scanner.nextDouble();

        System.out.println("Valor da segunda peça: ");
        double peca2 = scanner.nextDouble();

        System.out.println("Quantidade: ");
        double quant2 = scanner.nextDouble();

        double imposto = (peca * quant) + (peca2 * quant2) + (0.05 * 100 );

        System.out.println("Sua compra sairá por: " + imposto);

        System.out.println("================= Fim =================");

        scanner.close();
    }
}
