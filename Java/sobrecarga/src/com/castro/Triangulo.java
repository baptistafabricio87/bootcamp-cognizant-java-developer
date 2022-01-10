package com.castro;

public class Triangulo {

    protected void areaT(float lado){
        System.out.println("Area do triangulo retangulo: "
                + ((lado * lado) * Math.sqrt(3)) /4);
    }
    protected void areaT(float base, float altura){
        System.out.println("Area do triangulo: " + (base * altura) /2);
    }
}
