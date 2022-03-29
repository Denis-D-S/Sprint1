package com.company;

//Esta é uma "classe CONCRETA"

public class Aluno extends Pessoa { //HERANÇA NO EXTENDS!
    private int matricula;

    //Construtor que usa "super" com a classe Pai (abstrata)
    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    //Método abaixo temos um Override (Polimorfismo) do método original da Classe Pai. Isso é Polimorfismo
    //o Método original só imprima "nome" e "cpf". Modificamos para agora imprimir tb "matricula".
    //DICA: como este método é public, podemos usar o super
    public void imprime(){
        super.imprime();
        System.out.println("Matrícula: " + this.matricula);
    }

    //DICA: o método abaixo é ABSTRACT, então somos obrigados a programá-lo.
    @Override
    void chefe() {
        System.out.println("Aluno não tem chefe");
    }
}
