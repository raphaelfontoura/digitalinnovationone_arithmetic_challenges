/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.digitalinnovationone.desafiosjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivisorChallenge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        var result = -1;

        int divisor = Integer.parseInt(st.nextToken());
        int notDivisor = Integer.parseInt(st.nextToken());
        int multiple = Integer.parseInt(st.nextToken());
        int notMultiple = Integer.parseInt(st.nextToken());
        br.close();

        if (divisor != notDivisor && multiple != notMultiple) {
            int begin = divisor;
            int end = multiple;

            while (begin <= end) {
                if (begin % divisor == 0 && begin % notDivisor != 0
                        && multiple % begin == 0 && notMultiple % begin != 0) {
                    result = begin;
                    break;
                }
                if (begin % divisor == 0 && begin % notDivisor != 0
                        && multiple % begin == 0 && notMultiple % begin == 0) {
                    begin += divisor;
                    result = begin;
                    break;
                }
                break;
            }
        }
        System.out.println(result);

    }
}