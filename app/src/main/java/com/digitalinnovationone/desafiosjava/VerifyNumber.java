package com.digitalinnovationone.desafiosjava;

import java.util.Scanner;

public class VerifyNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int even = 0, odd = 0, positive = 0, negative = 0;

        for (var i = 1 ; i <=5 ; i++ ){
            var input = Integer.parseInt(scan.nextLine());
            if (input % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            if (input > 0) {
                positive ++;
            }
            if (input < 0){
                negative ++;
            }
        }

        System.out.println( even + " valor(es) par(es)");
        System.out.println( odd + " valor(es) impar(es)");
        System.out.println( positive + " valor(es) positivo(s)");
        System.out.println( negative + " valor(es) negativo(s)");

    }
}
