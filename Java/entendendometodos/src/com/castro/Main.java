package com.castro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Exercicio Calculadora:");
        Calcular calc = new Calcular();
        System.out.println("Soma: 2 + 4 = " + calc.somar(2, 4));
        System.out.println("Subtracao: 4 - 3 = " + calc.subtrair(4, 3));
        System.out.println("Multiplicacao: 4 * 6 = " + calc.multiplicar(4, 6));
        System.out.println("Divisão: 6 / 3 = " + calc.dividir(6, 3));

        System.out.println("-----------------------------------------");

        System.out.println("Exercicio Mensagem");
        Mensagem msg = new Mensagem();
        msg.defineMensagem(10);
        msg.defineMensagem(15);
        msg.defineMensagem(22);
        msg.defineMensagem(24);

        System.out.println("------------------------------------------");

        System.out.println("Exercicio Emprestimo");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.calcEmprestimo(1);
        emprestimo.calcEmprestimo(4);
        emprestimo.calcEmprestimo(8);
        emprestimo.calcEmprestimo(11);
        emprestimo.calcEmprestimo(0);
    }
}
