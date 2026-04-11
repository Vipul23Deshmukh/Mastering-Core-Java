package  Strings;

import java.util.Scanner;

public class Replace_Substring_In_String {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String s1=sc.nextLine();
        System.out.println("Enter String to be replaced ");
        String oldString=sc.nextLine();
        System.out.println("Enterr new String");
        String newString=sc.nextLine();



        String replaceString =s1.replace(oldString,newString);
        System.out.println("New String is "+replaceString);
    }
}


/*. Write a code to replace a substring in a string.
This problem asks to replace a substring within a string with another substring.

The goal is to find all occurrences of the target substring and replace them with the desired one.
Example for string “hello world”:
Replacing “world” with “wee” results in “hello wee”.*/
