package com.company;

public class Main {

    public static void main(String[] args) {
	    SerHumano sh1 = new SerHumano("sim, humano é mamifero", "Marte", "sim, humano é bípede");
        System.out.println(sh1.getMamifero()+ " ," + sh1.getHabitat() + " ," + sh1.getBipede());

        sh1.dormir();
    }
}
