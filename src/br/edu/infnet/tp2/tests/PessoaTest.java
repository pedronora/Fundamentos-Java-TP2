package br.edu.infnet.tp2.tests;

import br.edu.infnet.tp2.model.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setIdade(22);

        System.out.println("\nPessoa 1:\n" + p1.consultarSituacao());

        Pessoa p2 = new Pessoa(p1);
        p2.setNome("Márcio");

        System.out.println("\nPessoa 2:\n" + p2.consultarSituacao());

        Pessoa p3 = new Pessoa();
        p3.setNome("Claudia");
        p3.setIdade(25);

        System.out.println("\nPessoa 3:\n" + p3.consultarSituacao());

        Pessoa p4 = new Pessoa();
        System.out.println("\nPessoa 4:\n" + p4.consultarSituacao());

        System.out.println("\np1 é mais velho que p3?: " + maisVelho(p1, p3));
    }

    private static boolean maisVelho(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() > p2.getIdade()) {
            return true;
        }
        return false;
    }

}
