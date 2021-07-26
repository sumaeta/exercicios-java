package exercicio6;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Inicio ===========");

        System.out.println("Digite um valor");
        int valor = scanner.nextInt();
        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("Você digitou o valor: " + valor);
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antesecessor: " + antecessor);
    }
}
