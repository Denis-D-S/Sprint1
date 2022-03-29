package com.company;

public class Cachorro implements SerVivo, Teste2{
    //Construtor
    public Cachorro(){
        //Construtor vou deixar vazio...
    }

    //Métodos
    @Override
    public void mover() {
        System.out.println("Com patas");

    }

    @Override
    public void comer(int unidadesDeComida) {
        System.out.println("Cachorro comeu" + unidadesDeComida);
    }

    @Override
    public void info() {
        System.out.println("Estou imprimindo informações do cachorro");
    }

    @Override
    public void correr() {
        System.out.println("Correndo");
    }
}
