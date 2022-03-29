package com.company;

//MOSTRA O STATIC (exemplo prático com vendas de Carros)

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Preto", "Uno", "Marcos");
        Carro carro2 = new Carro("Branco", "Fusca", "Tabata");
        Carro carro3 = new Carro("Amarelo", "Brasília", "Godofredo");

        System.out.println("Vendemos o Uno Preto! +1 carro vendido!");
        carro1.venderCarro();

        System.out.println("Vendemos o Fusca Branco! +1 carro vendido!");
        carro2.venderCarro();

        System.out.println("Vendemos a Brasília Amarela! +1 carro vendido!");
        carro3.venderCarro();

        //note que usamos diferentes objetos para aumentar o contador, e todos eles apontam pro mesmo lugar, pois
        //é uma variável STATIC
        System.out.println("O total de carros vendidos foi: " + carro1.getCarrosVendidos());
    }
}
