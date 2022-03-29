package com.company;

public class Pardal implements SerVivo {
    //Construtor
    public Pardal(){
        //Construtor vou deixar vazio...
    }

    //Métodos
    @Override
    public void mover() {
        System.out.println("Voando");

    }

    @Override
    public void comer(int unidadesDeComida) {
        System.out.println("Pardal comeu" + unidadesDeComida);
    }

    @Override
    public void info() {
        System.out.println("Estou imprimindo informações do pardal");
    }
}
