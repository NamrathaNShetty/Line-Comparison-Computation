package com.bridgelabz;

public class LineComparision {

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 7;
        int y1 = 8;
        int y2 = 89;
        int p1 = 14;
        int p2 = 16;
        int q1 = 4;
        int q2 = 85;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

        System.out.println(lengthOfLine1);
        System.out.println(lengthOfLine2);

        if(lengthOfLine1 == lengthOfLine2)
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
    }
}
