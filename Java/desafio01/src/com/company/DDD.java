package com.company;

import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }

        sc.close();
        /*if(a == 61){
            System.out.printf("Brasilia\n");
        }
        else if(a == 71){
            System.out.printf("Salvador\n");
        }
        else if(a == 11){
            System.out.printf("Sao Paulo\n");
        }
        else if(a == 21 ){
            System.out.printf("Rio de Janeiro\n");
        }
        else if(a == 32){
            System.out.printf("                              ");
        }
        else if(){
            System.out.printf(                                );
        }
        else if(){
            System.out.printf(                                );
        }
        else if(a == 31){
            System.out.printf("Belo Horizonte\n");
        }
        else{
            System.out.printf("DDD nao cadastrado\n");
        }*/
    }

}
