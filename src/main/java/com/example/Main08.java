package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) throws IOException {
        create(100);
    }

    public static void create(int max) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc osob w grupie");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj login");
            String s = scan.next();
            System.out.println("Podaj ilosc punktow:");
            int n2 = scan.nextInt();
            try (FileWriter fileWriter = new FileWriter("exam.txt", true)){
                fileWriter.append(s + " " + n2 + "\n");
            }
            if (n2 > max * 0.60){
                try (FileWriter fileWriter2 = new FileWriter("exam_passed.txt", true)){
                    fileWriter2.append(s + " " + n2 + "\n");
            }
            }
        }
    }
}
