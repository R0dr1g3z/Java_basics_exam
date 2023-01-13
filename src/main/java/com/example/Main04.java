package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnTab()));
    }

    public static int[] returnTab(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
