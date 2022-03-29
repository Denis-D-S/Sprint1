package com.company;

//MOSTRANDO HERANÇA, POLIMORFISMO

public class Main {

    public static void main(String[] args) {
	    Aluno a1 = new Aluno("João", "1111111111", 99999999);
        a1.imprime();
        a1.chefe();

        Professor p1 = new Professor("Pedro", "2222222222222", 4000f);
        p1.imprime();
        p1.chefe();

        //DICA: note que NÃO PODEMOS estanciar um Objeto PESSOA pois esta classe é ABSTRACT!
    }
}
