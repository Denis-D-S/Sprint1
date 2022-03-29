package com.company;

abstract class SerVivo {

    private String mamifero;
    //public final String habitat = "Planeta Terra"; //variável final não pode ser modificada
    public final String habitat = "Terra"; //variável final não pode ser modificada

    //Construtor (pergunta: classe abstrata não pode/deve ter construtor?)
    public SerVivo(String mamifero, String habitat){
        this.mamifero = mamifero;
        //this.habitat = habitat;  //note que aqui no construtor dá erro, pois não pode dar valor à variável "final".
    }

    //GET E SET
    public String getHabitat() {
        return habitat;
    }

    public String getMamifero() {
        return mamifero;
    }

//    public void setHabitat(String habitat) { //NÃO PODE TER SET
//        this.habitat = habitat;
//    }

    public void setMamifero(String mamifero) {
        this.mamifero = mamifero;
    }


    //Método dormir
    public void dormir(){
        System.out.println("ZzZzZzZz...");
        //habitat = "Marte";   //DICA: note que já aponta erro quando tentamos dar um novo valor para uma variável "final". Não pode!
    }



}
