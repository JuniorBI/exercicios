package exercicio_J;

import java.util.Scanner;

//Dentre três números dados pelo usuário, exibi-los em ordem crescente.
public class J1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();

            if (num1 <= num2 && num1 <= num3) {
            System.out.println("Ordem crescente: " + num1 + num2 + num3);}
            else if (num1 <= num3 && num1 <= num2) {
                System.out.println("Ordem crescente: " + num1 + num3 + num2);
            }
            else if (num2 <= num1 && num2 <= num3) {
                System.out.println("Ordem crescente: " + num2 + num1 + num3);
            }
            else if (num2 <= num3 && num2 <= num1) {
                System.out.println("Ordem crescente: " + num2 + num3 + num1);
            }
            else if (num3 <= num1 && num3 <= num2) {
                System.out.println("Ordem crescente: " + num3 + num1 + num2);
            }
            else if (num3 <= num2 && num3 < num1) {
                System.out.println("Ordem crescente: " + num3 + num2 + num1);
            }
        }
    }

