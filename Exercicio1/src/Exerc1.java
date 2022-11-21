import javax.swing.*;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = n1.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Canal Nuvem");
        } else if (num % 3 == 0) {
            System.out.println("Canal");
        } else if (num % 5 == 0) {
            System.out.println("Nuvem");
        } else {
            System.out.println(" Numero nao pode ser dividiso por 3 e nem 5.");
        }

    }
}
