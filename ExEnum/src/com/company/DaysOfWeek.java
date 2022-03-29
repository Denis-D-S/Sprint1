package com.company;

//Quando uma variável possui seus valores já conhecidos de antemão, então é Enum. Dias da semana é exemplo clássico.

//DICA: todas as classes enum extends da java.lang.enum, e por isso temos acesso a vários Métodos diferentes.
public enum DaysOfWeek {
    //convenção manda ser UpperCase
    SUNDAY("Off"),
    MONDAY("Working"),
    TUESDAY("Working"),
    WEDNESDAY("Working"),
    THURSDAY("Working"),
    FRIDAY("Working"),
    SATURDAY("Off");

    //declaração de variável
    //esta variável é "final" pois queremos impedir que o dia da semana possa ser alterado.
    final String workDay;

    //Construtor
    DaysOfWeek(String workDay){
        this.workDay = workDay;
    }

    //GET - Enum pode ter Get também
    public String getDaysOfWeek(){
        return workDay;
    }

    //DICA: NÃO PODE TER SET! Pois isso iria contra a lógica do Enum! Os valores já são conhecidos e fixos!
    //então não faz sentido ter Set para tentar criar valores novos!
}
