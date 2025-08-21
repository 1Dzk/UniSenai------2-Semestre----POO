package org.example.atividadeRevisao.herança.escola;

public class Professor extends Pessoa {

    public String disciplina;
    public double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public void exibirDados(){
        System.out.println("Nome do Professor: " + this.nome + " Idade: " + this.idade + " Disciplina: " +  this.disciplina + " Salario: " + this.salario);
    }
}
