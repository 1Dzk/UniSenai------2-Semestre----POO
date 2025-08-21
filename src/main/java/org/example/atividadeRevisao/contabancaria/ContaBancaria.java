package org.example.atividadeRevisao.contabancaria;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;

    public void ContaBancaria(String numeroConta,double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    void sacar(double valor){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }else {
           this.saldo -= valor;
            System.out.println("Saque realizado");
        }
    }
    public void getSaldo(){
        System.out.printf("Saldo atual R$ %.2f", this.saldo);
    }
}
