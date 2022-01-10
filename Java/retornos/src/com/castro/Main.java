package com.castro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Exercicio Retornos");
        Quadrilateros qdl = new Quadrilateros();
        System.out.println("Area do quadrado: " + qdl.areaQ(4d));
        System.out.println("Area do retangulo: " + qdl.areaQ(4d, 5d));
        System.out.println("Area do trapezio: " + qdl.areaQ(8d, 6d, 7));
        System.out.println("Area do losango: " + qdl.areaQ(6f, 8f));
    }
}
