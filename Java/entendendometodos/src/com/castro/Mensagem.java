package com.castro;

public class Mensagem {

    protected void bomDia(){
        System.out.println("BOM DIA!");
    }
    protected void boaTarde(){
        System.out.println("BOA TARDE!");
    }
    protected void boaNoite(){
        System.out.println("BOA NOITE!");
    }
    protected void defineMensagem(int hora){
        switch (hora){
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
                bomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                boaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
                boaNoite();
                break;
            default:
                System.out.println("A HORA INFORMADA NÃO EXISTE!");
        }
    }
}
