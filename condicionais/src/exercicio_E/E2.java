package exercicio_E;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2)/2;

        System.out.println((media >= 5) ? "Você está aprovado" : "Você está reprovado");
    }
}
