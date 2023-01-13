package com.example;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(replaceStr("Testowanie", "t", "a"));
    }

    public static String replaceStr(String str, String forReplace, String replacement){
        return str.replaceAll(forReplace, replacement);
    }
}
