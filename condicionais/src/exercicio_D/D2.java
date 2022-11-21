package exercicio_D;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {

        double base = 1058.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = sc.nextDouble();

        System.out.println((salario > base) ? "PAGA IR" : "NÃO PAGA IR");
    }


}
