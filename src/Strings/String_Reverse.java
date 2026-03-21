package Strings;

/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/


import java.util.Arrays;

public class String_Reverse {
    public static void main(String[] args) {
        char [] s1={'H','e','l','l','o'};

        String_Reverse obj=new String_Reverse();
        obj.reverseString(s1);
        System.out.println(Arrays.toString(s1));



        char [] s2={'h','a','n','n','a','h'};
        String_Reverse obj1=new String_Reverse();
        obj1.reverseString(s2);
        System.out.println(Arrays.toString(s2));


    }

    public void reverseString(char[] s ){
        int start=0;
        int end=s.length-1;

        while(start<end){

            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.println(s);



    }


}
