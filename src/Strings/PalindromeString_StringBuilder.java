package Strings;

public class PalindromeString_StringBuilder {
    public static void main(String [] args){
        String s="madam";
        String reverse=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reverse));

        String s1="notpalindrome";
        String reverse1=new StringBuilder(s1).reverse().toString();
        System.out.println(s1.equals(reverse));
    }
}
