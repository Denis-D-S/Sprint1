package com.company;

//MOSTRA O STATIC

public class Main {

    public static void main(String[] args) {
        //uma sala de aula pode ter muitos alunos, mas apenas 1 professor.
	    SalaDeAula.professor = "Elias";

        SalaDeAula a1 = new SalaDeAula();
        a1.aluno = "Pedro";

        SalaDeAula a2 = new SalaDeAula();
        a2.aluno = "Maria";

        SalaDeAula a3 = new SalaDeAula();
        a3.aluno = "Araújo";

        System.out.println(a1.professor + " ," + a2.professor + " ," + a3.professor);
        //imprime o mesmo professor Static para todos os alunos.
    }
}

//Exemplo Static na prática:
//Loja de venda de veículos. Temos clientes diferentes comprando carros diferentes (carros serão Objetos)
//Podemos criar a variável static "total", e no contrutor a incrementa (total++). Pronto, saberemos quantos carros são vendidos.
