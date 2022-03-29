package com.company;

abstract class Pessoa {
    private String nome;
    private String cpf;

    //Construtor (DICA: normalmente classe abstrata não tem construtor pois não podemos criar Objetos
    //de classes abstratas. No entanto estamos criando construtor aqui pois queremos demonstrar o "super"
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Método Public
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

    //Método Abstrato (isso significa que todas as classes filhas serão obrigadas a criarem sua própria
    // versão de "chefe") - é aquele exemplo do "animalFazSom", onde cada um terá que override seu próprio som
    abstract void chefe();
}
