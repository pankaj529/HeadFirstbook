package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int x = 3;


        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");

                x -= 1;
            }


        }

    }

}

