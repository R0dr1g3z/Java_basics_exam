package com.example;

public class Main07 {
    public static void main(String[] args) {
        System.out.println(countNumbers("Wyniki z 5 i 2"));
    }

    public static int countNumbers(String str) {
        String[] arr = str.split("");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int number = Integer.parseInt(arr[i]);
                result += number;
            } catch (NumberFormatException e) {
            }
        }
        return result;
    }
}
