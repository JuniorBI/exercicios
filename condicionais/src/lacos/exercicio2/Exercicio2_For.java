//peça ao usuário a digitação de 5 números, verificando e informando quantos são maiores que 100.
package lacos.exercicio2;

import java.util.Scanner;

public class Exercicio2_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros para verificar quais sao maiores que 100.");
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + " numero");
            int numeros = sc.nextInt();
            if (numeros > 100) {
                maior++;
            }
        }
        System.out.println("Temos " + maior + " numeros maiores que 100.");
        System.out.println("Fim programa");
    }    
}
