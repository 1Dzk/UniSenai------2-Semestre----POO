package org.example.encapsulamento.Estoque;

public class ControleDeEstoque {

    private String name;
    private int quantidade;
    private double preco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
            System.out.println("Preço de '" + this.name + "' atualizado para R$ " + String.format("%.2f", this.preco));
        } else {
            System.out.println("ERRO: Tentativa de atribuir um preço negativo. A alteração não foi realizada.");
        }
    }

    public ControleDeEstoque(String nome, int quantidadeInicial, double novoPreco) {
        this.name = nome;
        // Garante que o estoque inicial não seja negativo
        this.preco = Math.max(0, quantidadeInicial);
        // Garante que o preço inicial não seja negativo
        if (preco >= 0) {
            this.preco = novoPreco;
        } else {
            this.preco = 0.0; // Valor padrão caso o preço inicial seja inválido
            System.out.println("AVISO: O preço inicial para '" + nome + "' era negativo e foi ajustado para 0.0.");
        }
    }

    public void registrarEntrada(int estoqueAdicionar) {
        if (estoqueAdicionar > 0) {
            this.quantidade += estoqueAdicionar;
            System.out.println("Entrada de " + estoqueAdicionar + " unidade(s) de '" + this.name + "' registrada.");
        } else {
            System.out.println("ERRO: A quantidade de entrada deve ser positiva.");
        }
    }
    public double calcularValorTotalEmEstoque() {
        return this.quantidade * this.preco;
    }
    public void registrarSaida(int quantidadeARemover) {
        if (quantidadeARemover <= 0) {
            System.out.println("ERRO: A quantidade de saída deve ser positiva.");
        }
        if (quantidadeARemover <= this.quantidade) {
            this.quantidade -= quantidadeARemover;
            System.out.println("Saída de " + quantidadeARemover + " unidade(s) de '" + this.name + "' registrada.");
        } else {
            System.out.println("ERRO: Saída não permitida. Quantidade solicitada (" + quantidadeARemover
                    + ") é maior que o estoque disponível (" + this.quantidade + ").");
        }
    }
}

