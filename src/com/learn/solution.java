package com.learn;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int j = 0; j < a.length; j++) {

            Scanner in = new Scanner(System.in);
            a[j] = in.nextInt();
            in.close();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
