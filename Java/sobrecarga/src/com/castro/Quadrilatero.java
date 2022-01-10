package com.castro;

public class Quadrilatero {

    protected void areaQ(double lado){
        System.out.println("Area do quadrado: " + lado*lado);
    }
    protected void areaQ(double lado1, double lado2){
        System.out.println("Area do retangulo: " + lado1*lado2);
    }
    protected void areaQ(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
    protected void areaQ(float diagonal1, float diagonal2) {
        System.out.println("Area do losango:" + (diagonal1 * diagonal2)/2);
    }
}
