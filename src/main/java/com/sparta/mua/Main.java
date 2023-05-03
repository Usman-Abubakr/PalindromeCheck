package com.sparta.mua;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        StringBuilder reversedWord = new StringBuilder();

        System.out.println("Please enter a word: ");
        String enteredWord = scanner.next();

        if (validateWord(enteredWord)) {
            word.append(enteredWord.toLowerCase());
            reversedWord.append(word).reverse();

            if ((word.toString()).equals(reversedWord.toString())) {
                System.out.println(word + " is a palindrome.");
            }
            else {
                System.out.println(word + " is NOT a palindrome.");
            }
        }
    }


    public static Boolean validateWord(String word){
        if (word.length() < 3) {
            System.out.println("Not a valid word!");
            return false;
        }
        else {
            System.out.println("Word entered: " + word);
            return true;
        }
    }
}