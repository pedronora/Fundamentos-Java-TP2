package br.edu.infnet.tp2.model;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor() {

    }

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public Professor(Professor source) {
        super(source.getNome(), source.getIdade());
        this.disciplina = source.disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String consultarSituacao() {
        return "PROFESSOR: \n" +
                super.consultarSituacao() + "\n" +
                "Disciplina: " + disciplina + "\n";
    }
}
