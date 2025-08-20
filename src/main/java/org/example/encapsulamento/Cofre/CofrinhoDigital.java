package org.example.encapsulamento.Cofre;

public class CofrinhoDigital {

    private String nome;
    private double saldo;
    private double meta;

    public CofrinhoDigital(String nome, double saldo, double meta) {
        this.nome = nome;
        this.saldo = saldo;
        this.meta = meta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
           valor += this.saldo;
            System.out.println("Saldo atualizado com sucesso! " + valor);
        }
        else{
            System.out.println("Não é possivel depositar");
        }
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            valor -= this.saldo;
            System.out.println("Saldo atualizado " + saldo);
        }else {
            System.out.println("Valor maior que o saldo atual");
        }
    }
    public void alterarMeta(double novaMeta){
        if(meta <= saldo){
          meta = novaMeta;
        }else{
            System.out.println("Valor da meta não pode ser menor que o saldo atual");
        }
    }
    public void metaAtingida(){
        if(meta == saldo){
            System.out.println("Meta atingida");
        }else{
            System.out.println("Meta não atingida");
        }
    }
}
