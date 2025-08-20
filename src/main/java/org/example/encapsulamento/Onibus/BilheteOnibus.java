package org.example.encapsulamento.Onibus;

public class BilheteOnibus {

    private String nome;
    private double saldo;
    private double tarifa = 4.50;
    private int bilhete = 0;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTarifa() {
        return tarifa;
    }
    public BilheteOnibus(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        bilhete ++;
    }
    public void adicionarSaldo(double saldo){
        if(saldo > 0){
            this.saldo += saldo;
            System.out.println("Saldo adicionado com sucesso!");
        }else {
            System.out.println("Saldo não pode ser um número negativo");
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

    public void viagemOnibus(){
        if(saldo > tarifa){
            System.out.println("Passagem paga com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}