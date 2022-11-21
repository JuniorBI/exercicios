/*Dentre três números dados pelo usuário e a ordem (“C” para crescente e “D”para decrescente),
 exibi-los na ordem solicitada.*/

package exercicio_K;

import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();
        System.out.println("Ordem 'crescente' digite C e ordem 'decrescente' digite D: ");
        char ordem = sc.next().charAt(0);



    }
}
