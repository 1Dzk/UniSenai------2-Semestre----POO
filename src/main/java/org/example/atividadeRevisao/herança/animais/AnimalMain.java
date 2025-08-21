package org.example.atividadeRevisao.herança.animais;

public class AnimalMain {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex",3);

        cachorro.exibeDados();
        cachorro.latir();

        Gato gato = new Gato("Frajola",4);

        gato.exibeDados();
        gato.miar();
    }
}
