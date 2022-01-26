package com.company;

import java.io.IOException;
import java.util.Scanner;

public class TempoDoDobby {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt() + sc.nextInt();
        if ( A > N )
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");

        sc.close();
    }
}
