package com.company;

public class Carro {
   private String cor;
   private String modelo;
   private String novoDono;
   private static int carrosVendidos = 0;

   //CONSTRUTOR (note que a variável static não entra no construtor)
   public Carro(String cor, String modelo, String novoDono){
       this.setCor(cor);
       this.setModelo(modelo);
       this.setNovoDono(novoDono);
   }

    //MÉTODO GET E SET DA VARIÁVEL STATIC
    public static int getCarrosVendidos() {
        return carrosVendidos;
    }

    public static void setCarrosVendidos(int carrosVendidos) {
        Carro.carrosVendidos = carrosVendidos;
    }


    //MÉTODOS GETTERS E SETTERS DAS OUTRAS VARIÁVEIS NORMAIS:
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNovoDono() {
        return novoDono;
    }

    public void setNovoDono(String novoDono) {
        this.novoDono = novoDono;
    }


    //MÉTODOS PRÓPRIOS:
    public void acelerar(){
        System.out.println("Vvvrruuuummmmmm");
    }
    public void buzinar(){
        System.out.println("Biiip biiippp");
    }
    public int venderCarro(){
       return carrosVendidos++;
    }
}
