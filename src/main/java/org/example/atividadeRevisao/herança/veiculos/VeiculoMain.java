package org.example.atividadeRevisao.herança.veiculos;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println("Informações do carro: ");
        carro.exibirInformacoes();

        System.out.println("");
        System.out.println("Informações da moto: ");
        moto.exibirInformacoes();
    }
}
