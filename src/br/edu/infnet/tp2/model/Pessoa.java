package br.edu.infnet.tp2.model;

import br.edu.infnet.tp2.util.Constant;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = Constant.NOME;
        this.idade = Constant.IDADE;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(Pessoa source) {
        this.nome = source.nome;
        this.idade = source.idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String consultarSituacao() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade;
    }
}
