package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

        /*
         * To find the length of line using co-ordinates provided from user and
         * calculating the length using formula
         */
        public double findLength(int x1, int x2, int y1, int y2) {
            double lengthofline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            return lengthofline;
        }

        /* To compare the two lines */
        public void checkEquality(double Line1, double Line2) {
            if (Line1 > Line2)
                System.out.println("Length of Line 1 is greater than the Length of Line 2");
            else if (Line1 < Line2)
                System.out.println("Length of Line 1 is lesser than the Length of Line 2");
            else
                System.out.println("Both the lines have equal length");
        }

        public static void main(String args[]) {

            /* Taking user input as co-ordinates of Line1 and Line2 */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the co-ordinates  for x-axis of First Line : ");
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            System.out.println("Enter the co-ordinates for y-axis of First Line : ");
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println("Enter the co-ordinates  for x-axis of second Line : ");
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            System.out.println("Enter the co-ordinates for y-axis of second Line : ");
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();

            /* Calling Method to calculate and compare the length of lines */
            LineComparison Compare = new LineComparison();
            double lengthOfLine1 = Compare.findLength(x1, x2, y1, y2);
            System.out.println("The lenth of First Line is :" + lengthOfLine1);
            double lengthOfLine2 = Compare.findLength(p1, p2, q1, q2);
            System.out.println("The lenth second Line is :" + lengthOfLine2);
            Compare.checkEquality(lengthOfLine1, lengthOfLine2);

        }
    }
