package com.castro.arrays;

public class Exercicios {

    protected void ordemNormal(){
        int [] array = {-5, -6, 15, 50, 80, 8};
        System.out.print("Vetor Normal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    protected void ordemInversa(){
        int [] array = {-5, -6, 15, 50, 80, 8};
        System.out.print("Vetor Inverso: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
