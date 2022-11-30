import java.util.ArrayList;

public class Exercicio12 {

    public static void main(String[] args) {


        ArrayList<Pessoa> Pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Maria", 18, "maria@email.com");
        Pessoa pessoa2 = new Pessoa("Joao", 35, "joao@email.com");
        Pessoa pessoa3 = new Pessoa("Diego", 15, "diego@email.com");

        Pessoas.add(pessoa1);
        Pessoas.add(pessoa2);
        Pessoas.add(pessoa3);

        for (Pessoa pessoa : Pessoas) {

            System.out.print(pessoa.VerificarIdade());

        }
    }
}