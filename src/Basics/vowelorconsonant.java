package Basics;

//JAVA Program to check whether the character entered by user is Vowel or Consonant.

import java.util.Scanner;
public class vowelorconsonant
{
    //class declaration
    public static void main(String[] args)
    {
        //main method declaration
        Scanner sc=new Scanner(System.in);         //scanner class object creation

        System.out.println(" Enter a character");
        char c = sc.next().charAt(0);         //taking a character c as input from user

        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'

                || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')             //condition for the vowels

            System.out.println(" Vowel");

        else if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))               //condition for the consonants

            System.out.println(" Consonant");
        else
            System.out.println(" Not an Alphabet");

        sc.close()  ;     //closing scanner class(not mandatory but good practice)
    }               //end of main method
}

/* Write a program to check whether a character is a vowel or consonant
This problem asks to check whether a given character is a vowel or a consonant. Vowels are the letters a, e, i, o, u
 s(both uppercase and lowercase). Any other alphabetic character is considered a consonant.*/