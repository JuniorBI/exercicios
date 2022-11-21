package exercicio_A;

import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        double num1 = numero.nextDouble();
        System.out.println((num1 < 0) ? "numero negativo" : "numero positivo");
    }
}
