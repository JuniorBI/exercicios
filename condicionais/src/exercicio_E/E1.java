//Calcule e exiba a média(simples) de duas notas dadas pelo usuário e verifique se esta é inferior a 5 exibindo “Você está reprovado” senão “Você está aprovado”

package exercicio_E;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2)/2;
        if (media >= 5) {
            System.out.println("Você está aprovado");
        } else {
            System.out.println("Você está reprovado");
        }
    }
}
