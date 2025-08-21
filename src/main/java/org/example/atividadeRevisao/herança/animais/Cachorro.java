package org.example.atividadeRevisao.herança.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void latir(){
        System.out.println("Au Au!");
    }

    public void Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeDados(){
        System.out.println("Dados do animal");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
