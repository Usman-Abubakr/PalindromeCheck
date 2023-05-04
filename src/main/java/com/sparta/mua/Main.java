package com.sparta.mua;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Enter a word, or sentence separated with a space for each word: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        checkPalindrome(input);
    }


    public static void checkPalindrome(String input){

        int longestPalindrome = 0;
        String longestPalindromeWord = "";

        String[] words = input.split(" ");
        if (words.length == 1) { // check if palindrome
            isSinglePalindrome(input);
        }
        else { // check longest palindrome
            isPalindromeSentence(longestPalindrome, longestPalindromeWord, words);
        }
    }


    private static void isSinglePalindrome(String input) {
        if (isPalindrome(input) != 0) {
//            System.out.println(input + " is a palindrome.");
            print(1,input,0);
        }
        else {
//            System.out.println(input + " is NOT a palindrome.");
            print(2,input,0);
        }
    }


    private static void isPalindromeSentence(int longestPalindrome, String longestPalindromeWord, String[] words) {
        for (String word : words) {
            if (isPalindrome(word) > longestPalindrome) {
                longestPalindrome = isPalindrome(word);
                longestPalindromeWord = word;
            }
        }
        if (longestPalindrome == 0) {
            print(3,"", 0);
        }
        else {
            System.out.println("The longest palindrome is " + longestPalindromeWord + " with a length of " + longestPalindrome);
//            print(3,longestPalindromeWord);
        }
    }


    public static int isPalindrome(String wordEntered){

        StringBuilder word = new StringBuilder();
        StringBuilder wordReversed = new StringBuilder();

        if (validateWord(wordEntered)) {
            word.append(wordEntered.toLowerCase());
            wordReversed.append(word).reverse();

            if ((word.toString()).equals(wordReversed.toString())) {
                return word.length();
            }
            else {
                return 0;
            }
        }
        return 0;
    }


    public static Boolean validateWord(String word){

        if (word.length() < 3) {
            print(0,"",0);
            return false;
        }
        else {
//            System.out.println("Word entered: " + word);
            return true;
        }
    }


    private static void print(int printCode, String text, int value) {
        // should be CASES
        if (printCode == 0) {
            System.out.println("Not a valid word!");
        }
        else if (printCode == 1) {
            System.out.println(text + " is a palindrome.");
        }
        else if (printCode == 2) {
            System.out.println(text + " is NOT a palindrome.");
        }
        else if (printCode == 3) {
            System.out.println("No palindrome found.");
        }
        else if (printCode == 4) {
            System.out.println("The longest palindrome is " + text + " with a length of " + value);
        }
    }
}