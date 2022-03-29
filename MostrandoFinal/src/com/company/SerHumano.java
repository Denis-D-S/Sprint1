package com.company;

public class SerHumano extends SerVivo {
    private String bipede;

    //Construtor que usa "super" com a classe Pai (abstrata)
    public SerHumano(String mamifero, String habitat, String bipede) {
        super(mamifero, habitat); //note que aqui no construtor dá erro, pois não pode dar valor à variável "final" (é o "habitat" que dá problema).
        this.bipede = bipede;
    }

    //GET E SET
    public String getBipede() {
        return bipede;
    }

    public void setBipede(String inteligente) {
        this.bipede = bipede;
    }

    //Método dormir (Polimorfismo)
    public void dormir(){
        System.out.println("Humano dorme por 8 horas: ZzZzZzZz...");
    }

}
