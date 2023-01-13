package com.example;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(shorten("Learn to coding", 5));
    }

    public static String shorten(String str, int length){
        return str.substring(0, length);
    }
}
