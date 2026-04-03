/*Write code to Check if two strings are Anagram or not
Two strings are called anagrams if they contain the same characters in the same frequencies, but possibly in different orders.

This code checks whether two given strings are anagrams of each other.
Example: Are “listen” and “silent” anagrams?
Sort both:
        “listen” → “eilnst”

        “silent” → “eilnst”
Both are the same, so “listen” and “silent” are anagrams.*/


package Strings;




import java.util.Arrays;
import java.util.Scanner;
    public class Anagram_String {
        static boolean isAnagram(String str1, String str2) {
            String s1 = str1.replaceAll("[\\s]", "");
            String s2 = str2.replaceAll("[\\s]", "");
            boolean status = true;

            if (s1.length() != s2.length())
                status = false;
            else {
                char[] a1 = s1.toLowerCase().toCharArray();
                char[] a2 = s2.toLowerCase().toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
                status = Arrays.equals(a1, a2);
            }
            return status;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two String :");
            String s1 = sc.next();
            String s2 = sc.next();
            boolean status = isAnagram(s1, s2);
            if (status)
                System.out.println(s1 + " and " + s2 + " are Anagram");
            else
                System.out.println(s1 + " and " + s2 + " are not Anagram");
        }
    }








