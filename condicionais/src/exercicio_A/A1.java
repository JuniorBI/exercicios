//Dado um número pelo usuário, verifique se ele é positivo, exibindo a mensagem “O numero é positivo” ou “O numero não é positivo”.

package exercicio_A;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("numero negativo");
        } else {
            System.out.println("numero positivo");
        }
    }

}
