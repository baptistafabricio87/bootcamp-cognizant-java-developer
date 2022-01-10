package com.castro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero qdl = new Quadrilatero();
        qdl.areaQ(2);
        qdl.areaQ( 4d, 6d);
        qdl.areaQ(6, 5, 7);
        qdl.areaQ(2f, 4f);

        System.out.printf("\n-------------------------- \n\n");

        System.out.println("Exercicio Triangulo");
        Triangulo tgl = new Triangulo();
        tgl.areaT(12);
        tgl.areaT(4, 6);
    }
}
