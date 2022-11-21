//Dado um número pelo usuário, verifique se ele é “Positivo”, “Negativo” ou “Nulo”(igual a zero).
package exercicio_F;

import java.util.Scanner;

public class F2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();

        System.out.println(numero == 0 ? "nulo" : ((numero > 0) ? "Positivo" : "negativo"));
    }
}
