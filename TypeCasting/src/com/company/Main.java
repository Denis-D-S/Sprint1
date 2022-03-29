package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution(1945));
    }

    //Dica: note que este Método é "int", portanto é exigido que ele retorn "int".
    static int solution(Integer year) { //troquei por Intenger para ter acesso a métodos
        Double century;
        century = (year.doubleValue() / 100); //tínhamos que usar double pois se não o Java reclamava na divisão por 100
        century = Math.ceil(century); //+1?
        return century.intValue(); //e daí na hora de dar o return, fazemos o casting de volta pra int.
    }
}
