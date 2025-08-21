package org.example.atividadeRevisao.herança.veiculos;

public class Carro extends Veiculo{

    int portas = 4;

    @Override
    void exibirInformacoes() {
        System.out.println("Marca: Honda");
        System.out.println("Ano: 2021");
        System.out.println("Portas: " + portas);
    }
}
