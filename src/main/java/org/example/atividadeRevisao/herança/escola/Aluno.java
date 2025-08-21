package org.example.atividadeRevisao.herança.escola;

public class Aluno extends Pessoa {

    public String matricula;
    public int notas;


    public Aluno(String nome, int idade, String matricula, int notas) {
        super(nome, idade);
        this.matricula = matricula;
        this.notas = notas;
    }

    public void exibirDados(){
        System.out.println("Nome do aluno: " + this.nome + " Idade: " + this.idade + " Matricula: " + this.matricula + " Notas: " + this.notas);
    }
}
