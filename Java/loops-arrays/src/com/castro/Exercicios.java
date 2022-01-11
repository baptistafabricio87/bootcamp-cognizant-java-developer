package com.castro;

import java.util.Scanner;

public class Exercicios {

    /** 01
     * Faça um programa que leia conjuntos de dois valores,
     * o primeiro representando a matrícula do aluno e o
     * segundo representando a sua altura em centímetros.
     * (Pare o programa inserindo o valor 0 no campo nome)
     */
    protected void setNomeIdade(){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Informe Nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;
            System.out.println("Informe Idade ");
            idade = sc.nextInt();
        }
    }

    /** 02
     * Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja inválido e
     * continue pedindo até que o usuário informe um valor válido.
     */
    protected void setNota(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira Nota: ");
        int nota = sc.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = sc.nextInt();
        }
    }

    /** 03
     * Faça um programa que leia 5 números e informe o maior número e
     * a média desses números.
     */
    protected void setMaiorMedia(){
        Scanner sc = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            if (numero > maior) maior = numero;
            soma = soma + numero;
            cont++;
        }while(cont < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + soma / 5);
    }

    /** 04
     * Faça um programa que peça N números inteiros.
     * Calcule e mostre a quantidade de números pares e
     * a quantidade de números impares.
     */
    protected void parImpar(){
        Scanner sc = new Scanner(System.in);

        int qtdNumeros = 0, numero;
        int qtdPar = 0, qtdImpar = 0;
        int count = 0;

        System.out.println("Quantidade de Numeros: ");
        qtdNumeros = sc.nextInt();

        do {
            System.out.println("Informe Numero: ");
            numero = sc.nextInt();
            if ((numero % 2) == 0) qtdPar++;
            else qtdImpar++;

            count++;
        } while (count < qtdNumeros);

        System.out.println("Quantidade de Par: " + qtdPar);
        System.out.println("Quantidade de Impar: " + qtdImpar);
    }

    /**
     * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
     * qualquer número inteiro entre 1 a 10. O usuário deve informar
     * de qual numero ele deseja ver a tabuada.
     * A saída deve ser conforme o exemplo abaixo:
     * Tabuada de 5:
     * 5 X 1 = 5
     * 5 X 2 = 10
     * ...
     * 5 X 10 = 50
     */
    protected void tabuada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabuada ? ");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada do " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }
    }

    /**
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
     * Ex.: 5!=5.4.3.2.1=120
     */
    public void fatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial! ");
        System.out.println("Qual numero ? ");
        int fatorial = sc.nextInt();

        System.out.print(fatorial + "! = ");

        int mult = 1;
        for (int i = fatorial; i >= 1; i--) {
            mult *= i;
        }
        System.out.println(mult);
    }
}
