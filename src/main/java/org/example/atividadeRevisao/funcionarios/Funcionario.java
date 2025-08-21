package org.example.atividadeRevisao.funcionarios;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        if(salario<0){
            System.out.println("Saldo é impossível ser menor que 0");
        }
        this.salario = salario;
    }
    void aumentarSalario(double percentual){
       salario =  salario + (salario * percentual / 100) ;
        System.out.println("Salario atualizado com sucesso!\n");
    }
    void exibirDados(){
        System.out.printf("Nome do funcionário: %s\nCargo: %s \nSalario R$%.2f \n",nome,cargo,salario);
    }
}
