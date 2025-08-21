package org.example.atividadeRevisao.herança.veiculos;

public class Moto extends Veiculo{

    int cilindradas = 150;


    @Override
    void exibirInformacoes() {
        System.out.println("Marca: BMW");
        System.out.println("Ano: 2025");
        System.out.println("Cilindradas: " +cilindradas);
    }
}
