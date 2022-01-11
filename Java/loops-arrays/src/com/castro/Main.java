package com.castro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Exercicios ex = new Exercicios();
        int op;

        System.out.println("Informe a opção desejada: ");
        System.out.println("1 - Nome e Idade");
        System.out.println("2 - Nota");
        System.out.println("3 - Maior e Media");
        System.out.println("4 - Par e Impar");
        System.out.println("5 - Tabuada");
        System.out.println("6 - Fatorial");
        op = sc.nextInt();

        switch (op){
            case 1:
                ex.setNomeIdade();
                break;
            case 2:
                ex.setNota();
                break;
            case 3:
                ex.setMaiorMedia();
                break;
            case 4:
                ex.parImpar();
                break;
            case 5:
                ex.tabuada();
                break;
            case 6:
                ex.fatorial();
                break;
            default:
                System.out.println("Opção inválida! Encerrando.");
                break;
        }
    }
}
