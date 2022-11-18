package br.edu.infnet.tp2.tests;

import br.edu.infnet.tp2.model.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        System.out.println("\n1 - " + p1.consultarSituacao());

        p1.setNome("Pedro");
        p1.setIdade(35);
        p1.setDisciplina("Java");

        System.out.println("\n1 - " + p1.consultarSituacao());

        Professor p2 = new Professor(p1);
        p2.setNome("Arthur");

        System.out.println("\nO novo professor se chama " + p2.getNome() + ", também possui " + p2.getIdade() + " anos de idade e também é especialista em " + p2.getDisciplina() + ".");

        Professor p3 = new Professor("Anita", 25, "Redes");

        System.out.println("\n3 - " + p3.consultarSituacao());
    }
}
