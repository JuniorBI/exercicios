//Dentre três números dados pelo usuário, verificar e exibir o de maior valor.
package exercicio_I;

import java.util.Scanner;

public class I1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("O primeiro numero é maior!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo numero é maior!");
        } else {
            System.out.println("O terceiro numero é maior!");
        }
        System.out.println("Fim programa.");
    }
}
