package com.sparta.mua;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Enter a word, or sentence separated with a space for each word: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int longestPalindrome = 0;
        String longestPalindromeWord = "";

        String[] words = input.split(" ");
        if (words.length == 1) { // check if palindrome
            isPalindrome(input);
        }
        else { // check longest palindrome
            for (String word : words) {
                if (isPalindrome(word) > longestPalindrome) {
                    longestPalindrome = isPalindrome(word);
                    longestPalindromeWord = word;
                }

            }
            System.out.println("The longest palindrome is " + longestPalindromeWord + " with a length of " + longestPalindrome);
        }





    }





    public static int isPalindrome(String wordEntered){
        StringBuilder word = new StringBuilder();
        StringBuilder wordReversed = new StringBuilder();

        if (validateWord(wordEntered)) {
            word.append(wordEntered.toLowerCase());
            wordReversed.append(word).reverse();

            if ((word.toString()).equals(wordReversed.toString())) {
                System.out.println(word + " is a palindrome.");
                System.out.println(word.length());
                return word.length();
            }
            else {
                System.out.println(word + " is NOT a palindrome.");
                return 0;
            }
        }
        return 0;
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