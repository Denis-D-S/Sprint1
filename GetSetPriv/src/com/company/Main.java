package com.company;
import java.util.Scanner;

//MOSTRA MÉTODO GET E SET, modificando o PRIVATE

public class Main {

    public static void main(String[] args) {
	    String time;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in); //criamos Objeto Scanner, onde ele contém vários Métodos

        System.out.println("Qual o seu time do coração?");
        time = texto.nextLine();

        torcida.setTime(time); //exemplo de set funcionando

        //abaixo exemplo de get funcionando (get retorna algo, então para ver este algo precisamos usar o println)
        System.out.println(torcida.getTime());
        torcida.mostraTime(); //método que imprime informações

    }
}
