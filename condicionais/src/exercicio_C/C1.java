//Dado um número pelo usuário, verificar se ele é “PAR” ou “ÍMPAR”, exibindo sua respectiva mensagem.

package exercicio_C;

public class C1 {

    public static void main(String[] args) {

        int num = 11;
        if (num % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
    }
}
