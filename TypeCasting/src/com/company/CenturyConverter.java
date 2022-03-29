package com.company;

public class CenturyConverter {

    int solution(int year) {
        double century;//create century to double precision
        century = (double)year / 100; //and divide it by 100, also typecasting year to double precision
        century = Math.ceil(century);//and get the ceiling of it
        return (int)century; //and return century, but typecasting it back to int precision
    }
}
