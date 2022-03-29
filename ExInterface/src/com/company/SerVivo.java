package com.company;

//Interface é uma Classe que possui especificações para outras Classes. É um "manual de implementação".
public interface SerVivo {
    //Todos os Métodos abaixo obrigatoriamente terão de ser override (Polimorfismo) nas classes "filhas"
    public void mover();
    public void comer(int unidadesDeComida);
    public void info();

    //estes métodos acima são parecidos com "métodos abstratos" das "classes abstratas", pois será obrigatório
    //fazer polimorfismo de ambas as formas. No entanto na Interface dá para colocar "public" de boa.
}
