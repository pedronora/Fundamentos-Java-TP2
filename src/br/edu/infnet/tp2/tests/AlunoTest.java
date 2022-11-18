package br.edu.infnet.tp2.tests;

import br.edu.infnet.tp2.model.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 25, 5, 3);
        System.out.println("\n1 - " + a1.consultarSituacao());

        Aluno a2 = new Aluno(a1);
        a2.setNome("Marcos");
        a2.setIdade(20);
        a2.setAv2(9);
        System.out.println("\n2 - " + a2.consultarSituacao());

        Aluno a3 = new Aluno();
        a3.setNome("Joaquim");;
        a3.setIdade(30);
        a3.setAv1(8);
        a3.setAv2(7);
        System.out.println("\n3 - " + a3.consultarSituacao());

        Aluno a4 = new Aluno();
        System.out.println("\n4 - \n" + a4.consultarSituacao());

        System.out.println("\nA idade de " + a1.getNome() + " é " + a1.getIdade() + " e esta é sua situação: " + a1.obterSituacao(a1.obterMedia())) ;
        System.out.println("A idade de " + a2.getNome() + " é " + a2.getIdade()+ " e esta é sua situação: " + a2.obterSituacao(a2.obterMedia()));
        System.out.println("A idade de " + a3.getNome() + " é " + a3.getIdade()+ " e esta é sua situação: " + a3.obterSituacao(a3.obterMedia()));
    }
}
