package org.example.atividadeRevisao.contabancaria;

public class ContaBancariaMain {
    public static void main(String[]args){

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000);
        conta.sacar(1500);
        conta.sacar(200);
        conta.getSaldo();
    }
}
