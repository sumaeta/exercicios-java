package exercicio5;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================== Inicio ========================");

        double salarioMinimo = 1.000;

        System.out.println("Informe seu salário: ");
        double salario = scanner.nextDouble();

        if(salario < salarioMinimo){
            System.out.println("O salário minimo é de " + salarioMinimo + " e o seu salário minimo é de " + salario +
                    " Você esta ganhando pouco");
        } if (salario > salarioMinimo){
            System.out.println("O salário minimo é de " + salarioMinimo + " e o seu salário minimo é de " + salario +
                    " Você esta ganhando bem");
        }


        System.out.println("======================== Fim ========================");
        scanner.close();
    }
}
