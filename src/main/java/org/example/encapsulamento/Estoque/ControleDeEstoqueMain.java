package org.example.encapsulamento.Estoque;

public class ControleDeEstoqueMain {
    public static void main(String[] args) {

        System.out.println("\n 1 - Produto");
        ControleDeEstoque coxinha = new ControleDeEstoque("Coxinha de Frango", 50, 7.50);
        System.out.println("Status Inicial: " + coxinha);


        System.out.println("\n REGISTRAR ENTRADA");
        coxinha.registrarEntrada(20);
        System.out.println("Status " + coxinha);

        System.out.println("\n SAÍDA VÁLIDA");
        coxinha.registrarSaida(15);
        System.out.println("Status Pós-Saída: " + coxinha);

        System.out.println("\n Valor total no estoque");
        System.out.println(coxinha);
        System.out.println("Valor total final em estoque para " + coxinha.getName() + ": R$ "
                + String.format("%.2f", coxinha.calcularValorTotalEmEstoque()));
    }
}
