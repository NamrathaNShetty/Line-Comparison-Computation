package com.bridgelabz;

public class LineComparision {

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 7;
        int y1 = 8;
        int y2 = 89;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(lengthOfLine1);
    }
}
