package com.company;

//Esta é outra Classe Concreta

public class Professor extends Pessoa { //HERANÇA NO EXTENDS
    private float salario;

    //Construtor
    public Professor(String nome, String cpf, float salario){
        super(nome,cpf);
        this.salario = salario;
    }

    //Método (reescrita, Override, Polimorfismo)
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    @Override
    void chefe() {
        System.out.println("O chefe do professor é o Reitor da faculdade");
    }
}
