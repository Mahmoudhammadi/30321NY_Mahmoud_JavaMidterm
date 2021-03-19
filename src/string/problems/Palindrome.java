package string.problems;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String word;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a string");
        word = sc.next();
        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " " + "is not  a Palindrome");

        }
        sc.close();

    }
    public static boolean isPalindrome(String string) {
        String reverse = "";
        for (int i = 0; i < string.toLowerCase().length(); i++) {
            reverse = string.charAt(i) + reverse.toLowerCase();
        }
        if (string.toLowerCase().equals(reverse)) {
            return true;
        } else
            return false;
    }




    }

