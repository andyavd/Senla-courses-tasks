package com.andyavd.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * Числа Фибоначчи
 */

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 1;
        int b = 1;
        int n = Integer.parseInt(reader.readLine());
        int sum = 0;

        System.out.print(a + " " + b + " ");

        while(sum < n){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
                if (a + b > n) {
                    break;
                }
        }

    }
}
