package exercicio_I;

import java.util.Scanner;

public class I2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();

        System.out.println((num1 > num2 && num1 > num3) ? "Primeiro numero é maior." : ((num2 > num1 && num2 > num3)
                ? "Segundo numero é maior" : "Terceiro numero é maior"));
    }
}
