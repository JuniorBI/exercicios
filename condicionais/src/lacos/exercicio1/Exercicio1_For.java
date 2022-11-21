//Some números dados pelo usuário até que ele digite um número negativo.
package lacos.exercicio1;

import java.util.Scanner;

public class Exercicio1_For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma, numero = 0;

        System.out.println("Digite o numero: ");
        numero = sc.nextInt();

        for (int i = 0; i < 0 ; i++) {
            soma = numero++;


        }

    }

}
