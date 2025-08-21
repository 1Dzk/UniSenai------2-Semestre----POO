package org.example.atividadeRevisao.herança.animais;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void miar(){
        System.out.println("Miau!");
    }

    public void exibeDados(){
        System.out.println("Dados do animal");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
