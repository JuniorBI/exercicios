// Dada uma idade pelo usuário, verificar e exibir a maior idade do mesmo, exibindo a mensagem “Você é maior de Idade” ou “Você não é maior de Idade”

package exercicio_B;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de Idade");
        } else {
            System.out.println("Você 'Não' é maior de Idade");
        }
    }
}
