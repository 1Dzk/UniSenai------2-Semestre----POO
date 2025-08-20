package org.example.encapsulamento.Cofre;

public class CofrinhoDigitalMain {
    public static void main(String[] args) {

        CofrinhoDigital cd = new CofrinhoDigital("Jose",50.00, 300.00);

        cd.depositar(200);
        cd.metaAtingida();
        cd.alterarMeta(200);
        cd.sacar(20);

    }
}
