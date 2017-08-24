package com.andyavd.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * Проверка на палиндромность
 */

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String typeWord = reader.readLine();

        if (isPalindrome(typeWord)){
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }

    }

    private static boolean isPalindrome (String word){
        word = word.replaceAll("\\W", "");
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String reversedWord = builder.toString();

        return word.equalsIgnoreCase(reversedWord);
    }
}
