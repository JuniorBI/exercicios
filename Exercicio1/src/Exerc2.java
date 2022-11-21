// 1 - Quando o numero for divisivel por 3 retornar Canal, 5 retornar Nuvem, ambos CanalNuvem.

import javax.swing.*;

public class Exerc2 {
    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if(n1 % 3 == 0 & n1 % 5 == 0) {
                JOptionPane.showMessageDialog(null,"CANAL NUVEM");
        } else if (n1 % 3 == 0) {
                JOptionPane.showMessageDialog(null,"Canal");
        } else if (n1 % 5 == 0) {
                JOptionPane.showMessageDialog(null,"Nuvem");
        } else {
                JOptionPane.showMessageDialog(null,"Numero não pode ser dividido por 3 e nem por 5.");
            }

        System.out.println("fim programa");
    }
}