package com.andyavd.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * Простые числа
 */

public class Solution {

    public static void main(String[] args)  throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 2; i < n; i++){
            boolean isPrime = true;
            int sqrt = (int)Math.sqrt(i);

            for (int j = 2; j <= sqrt; j++){
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

}
