//Verifique se uma pessoa “PAGA IR” ou “NÃO PAGA IR”, exibindo a devida mensagem; sabendo-se que o quem ganha até R$ 1058,00 é isento.
package exercicio_D;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {

        double base = 1058.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        if (salario <= base) {
            System.out.println("NÃO PAGA IR");
        } else {
            System.out.println("PAGA IR");
        }
    }
}
