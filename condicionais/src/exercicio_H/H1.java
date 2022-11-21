/*
Dadas 4 notas, fazer um algoritmo que calcule a media semestral da uninove. Descarte a menor nota entre as
 duas primeiras e calcule a média semestral.
 */

package exercicio_H;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        if(nota1 > nota2) {
            System.out.println("Media semestral foi: " + ((nota1+nota3+nota4)/3));
        } else {
            System.out.println("Media semestral foi: " + ((nota2+nota3+nota4)/3));
        }

    }

}
