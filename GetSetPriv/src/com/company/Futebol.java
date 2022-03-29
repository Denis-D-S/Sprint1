package com.company;

public class Futebol {
    //esta variável é PRIVATE, ou seja, ela não pode ser modificada diretamente. Por isso GET e SET
    //Dica: para ver isso, mude para public e veja o autocomplete do Objeto no Main
    private String nomeTime;

    //Método GET
    public String getTime(){
        return nomeTime;
    }

    //Método SET
    public void setTime(String meuTime){
        nomeTime = meuTime;
    }

    //Método que imprime
    public void mostraTime(){
        System.out.println("Seu time do coração é: " + getTime());
    }
}
