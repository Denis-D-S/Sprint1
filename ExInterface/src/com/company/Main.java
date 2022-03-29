package com.company;

//DEMONSTRANDO INTERFACE e a implementação delas em Classes Filhas

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Pardal pardal1 = new Pardal();

        cachorro1.info();
        pardal1.info();

        cachorro1.correr();
    }
}
