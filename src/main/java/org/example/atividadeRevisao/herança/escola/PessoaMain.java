package org.example.atividadeRevisao.herança.escola;

public class PessoaMain {
    public static void main(String[] args) {

        Aluno al1 = new Aluno("Enzo",15,"4393ws",9);
        Aluno al2 = new Aluno("Maria",18,"4293ws",6);

        al1.exibirDados();
        al2.exibirDados();

        Professor prof1 = new Professor("Alexandre",25,"Portugues",2000);

        prof1.exibirDados();
    }
}
