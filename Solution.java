package com.andyavd.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andreiaudzeichyk on 24.08.17.
 * Пересечение отрезков
 */

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double ax1 = Double.parseDouble(reader.readLine());
        double ay1 = Double.parseDouble(reader.readLine());
        double ax2 = Double.parseDouble(reader.readLine());
        double ay2 = Double.parseDouble(reader.readLine());
        double bx1 = Double.parseDouble(reader.readLine());
        double by1 = Double.parseDouble(reader.readLine());
        double bx2 = Double.parseDouble(reader.readLine());
        double by2 = Double.parseDouble(reader.readLine());

        double v1 = (bx2 - bx1) * (ay1 - by1) - (by2 - by1) * (ax1 - bx1);
        double v2 = (bx2 - bx1) * (ay2 - by1) - (by2 - by1) * (ax2 - bx1);
        double v3 = (ax2 - ax1) * (by1 - ay1) - (ay2 - ay1) * (bx1 - ax1);
        double v4 = (ax2 - ax1) * (by2 - ay1) - (ay2 - ay1) * (bx2 - ax1);

        if ((v1*v2<=0) && (v3*v4<=0)) {
            System.out.println("Отрезки пересекаются");
        } else  {
            System.out.println("Отрезки не пересекаются");
        }
    }
}

