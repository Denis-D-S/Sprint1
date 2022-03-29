package com.company;

//EXEMPLO ENUM:

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    //note que não usamos "new", pois o ENUM é um valor fixo pré-definido.
        //então não podemos usar o "new" para simplesmente criar novos valores.
        //o que acontece é que temos uma lista já pré-definida de valores para selecionar. Neste caso, SUNDAY.
        DaysOfWeek day1 = DaysOfWeek.SUNDAY;

        if (day1 == DaysOfWeek.SUNDAY){
            System.out.println("-------------------------");
            System.out.println(day1.toString().toLowerCase() + " is a nice day to rest."); //note que dá pra usar métodos
            System.out.println("-------------------------");
        }

        //Agora testando o valor das variáveis
        System.out.println("What is up today? " + DaysOfWeek.SUNDAY.workDay);

        System.out.println("And today, what is up? " + DaysOfWeek.MONDAY.workDay);

        //podemos reatribuir outro valor
        day1 = DaysOfWeek.MONDAY;
        System.out.println("-------------------------");
        System.out.println(day1.toString().toLowerCase() + " is a nice day to work");
        System.out.println("Today, what I will be doing? " + day1.getDaysOfWeek()); //usei o Get

    }
}

//Um exemplo prático de onde usar ENUNS seria nos horários. Ou na criação de um banco de horas.
//existem coisas (as horas) que queremos bloquear, deixar fixa sem a possibilide de alteração. Então usamos Enum.
