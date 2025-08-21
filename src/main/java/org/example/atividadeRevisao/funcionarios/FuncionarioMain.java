package org.example.atividadeRevisao.funcionarios;

public class FuncionarioMain {
    public static void main(String[] args) {


        Funcionario func = new Funcionario("Carlos", "Diretor", 10000);
        Funcionario func2 = new Funcionario("Roberto","Programador",3000);

        func.exibirDados();
        func2.exibirDados();

        func.aumentarSalario(10);
        func2.aumentarSalario(10);

        func.exibirDados();
        func2.exibirDados();
    }
}
