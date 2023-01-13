package com.example;

import java.util.Arrays;
import java.util.Random;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(div(4, 50)));
    }

    public static int[] div(int size, int interval){
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int random = r.nextInt(interval) + 1;
            while(random % 2 == 1 || random % 3 == 0){
                random = r.nextInt(interval) + 1;
            }
            arr[i] = random;
        }
        return arr;
    }
}
