package Basics;

import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args)
    {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        //Convert the number to string
        String s1 = Integer.toString(number);
        //Calculate the length
        int l1 = s1.length();
        int sq = number * number;
        String s2 = Integer.toString(sq);
        int l2 = s2.length();
        //Create Substring
        String s3 = s2.substring(l2-l1);
        if(s1.equals(s3))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}
/* Write a code to find an Automorphic number
An Automorphic number is a number whose square ends with the same digits as the number itself.

For example:
5 is an Automorphic number because 5^2 = 25, and the last digit is 5.
6 is an Automorphic number because 6^2 = 36, and the last digit is 6.
25 is an Automorphic number because 25^2 = 625, and the last two digits are 25.*/