package com.andyavd.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * Удаление чисел из текста
 */

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String clear = text.replaceAll("\\d", "");

        System.out.println(clear);

    }
}
