package com.andyavd.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * НОД и НОК
 */

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Наибольший общий делитель: " + nod(a,b));
        System.out.println("Наименьшее общее кратное: " + nok(a,b));

    }

    private static int nod(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (nod(b, a%b));
        }
    }

    private static int nok(int a, int b) {

        return a / (nod(a, b)) * b;

    }
}

