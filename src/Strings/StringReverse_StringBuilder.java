package Strings;

public class StringReverse_StringBuilder {
    public static void main(String[] args) {
        String s= "LelouchLamperouge";
        String reverse= new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
    }
}
