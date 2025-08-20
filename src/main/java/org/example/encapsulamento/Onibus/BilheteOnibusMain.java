package org.example.encapsulamento.Onibus;

public class BilheteOnibusMain {
    public static void main(String[] args) {
        BilheteOnibus bl = new BilheteOnibus("Henrique" , 20.00);

        bl.adicionarSaldo(30);
        bl.consultarSaldo();
        bl.viagemOnibus();


        System.out.println("Boa viagem " + bl.getNome());
    }
}
