package com.castro;

public class Emprestimo {

    double valor = 9500;
    double taxa = 0.03;
    double total;
    double parcelado;

    protected void calcEmprestimo(int parcela){
        switch (parcela) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Valor do emprestimo: " + valor);
                total = valor + (valor * taxa);
                System.out.println("Numero de parcelas: " + parcela);
                parcelado = (total/parcela) + (total*0.01);
                System.out.println("Valor da parcela: " + parcelado);
                total = parcelado * parcela;
                System.out.println("Valor a pagar: " + total);
                System.out.println("------------------------------------");
                break;
            default:
                System.out.println("Numero de parcelas inesperado!");
        }
    }
}
