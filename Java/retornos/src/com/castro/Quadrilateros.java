package com.castro;

public class Quadrilateros {

    protected double areaQ(double lado){
        return lado * lado;
    }
    protected double areaQ(double lado1, double lado2){
        return lado1 * lado2;
    }
    protected double areaQ(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) /2;
    }
    protected float areaQ(float diagonal1, float diagonal2){
        return (diagonal1 * diagonal2) /2;
    }
}
