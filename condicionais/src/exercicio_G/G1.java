/*
Dado o salário de uma pessoa, cobrar 8% de INSS de todos e verificar se ela paga IR(ganhar mais que 1058 reais).
Se ela não pagar, exibir a mensagem “Isento de pagamento de IR”, senão calcular o valor a ser pago de
acordo com os critérios:
*/
package exercicio_G;

import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();
        salario = salario * 0.92;

        double s1 = 1434.59;
        double s2 = 2150.0;
        double s3 = 2866.70;
        double s4 = 3582.0;

        double desc1 = 107.59;
        double desc2 = 268.84;
        double desc3 = 483.84;
        double desc4 = 662.92;


        if(salario <= s1) {
            System.out.println("isento de pagamento de IR");
        } else if (salario > s1 && salario <= s2) {
            System.out.println("Desconto de 7,5%, seu salario é: " + (salario - desc1));
        } else if (salario > s2 && salario <= s3) {
            System.out.println("Desconto de 15%, seu salario é: " + (salario - desc2));
        } else if (salario > s3 && salario <= s4) {
            System.out.println("Desconto de 22,5%, seu salario é: " + (salario - desc3));
        } else {
            System.out.println("Desconto de 27,5%, seu salario é: " + (salario - desc4));
        }
        System.out.println("Fim Programa.");
    }
}
