/*
Dado um numero pelo usuário, verificar se ele é ou ao primo. Sabe-se que um numero primo é aquele que
somente é divisível por 1 e ele mesmo, por exemplo: 7.
*/

package exercicos_I;

import java.util.Scanner;

public class I1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se eh primo: ");
        int num1 = sc.nextInt();

        if (num1 <= 1) {
            System.out.println("numero nao eh primo");
        } else if (num1%num1 == 0){
            System.out.println("numero primo");
        } else {
            System.out.println();
        }
    }
}
 // voltar aqui e tentar a logica.