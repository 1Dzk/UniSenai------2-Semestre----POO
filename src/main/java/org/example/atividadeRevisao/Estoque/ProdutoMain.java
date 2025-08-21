package org.example.atividadeRevisao.Estoque;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz",4.40,100);
        Produto p2 = new Produto("Carne",16,50);
        Produto p3 = new Produto("Feijão",2.30,300);

        p1.setPreco(3.20);
        p1.setQuantidade(200);

        p1.calcularValorTotal();
        p2.calcularValorTotal();
        p3.calcularValorTotal();

    }
}
