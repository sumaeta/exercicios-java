package exercicio1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Iniciando o teste ===========");

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.print("Em que mes estamos?");
        int mes = scanner.nextInt();

        System.out.println("Que dia estamos?");
        int dia = scanner.nextInt();

        int x = (idade * 365) + (mes * 30) + dia;

        System.out.println("A Quantidade de dias são: " + x);

        scanner.close();
    }
}
