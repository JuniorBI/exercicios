package exercicio_B;

import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println((idade > 18) ? "Voce eh adulto" : "Voce 'Nao' eh adulto");
    }
}
