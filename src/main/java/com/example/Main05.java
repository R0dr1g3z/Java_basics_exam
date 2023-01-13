package com.example;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        System.out.println(sphere());
    }

    public static double sphere(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promien kuli");
        int r = scan.nextInt();
        return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
    }
}
