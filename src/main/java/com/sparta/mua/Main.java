package com.sparta.mua;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        getWord();
    }




    public static void getWord(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.next();

        if (isValidWord(word)) {
            word = word.toLowerCase();
            print(word);
        }
    }

    public static Boolean isValidWord(String word){
        if (word.length() < 3) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void print(String word){
        System.out.println(word);
    }


}