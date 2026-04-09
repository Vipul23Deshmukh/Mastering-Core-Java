package Basics;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a No");
        int no =sc.nextInt();

        System.out.println(no);
        int reverse=0;
        String n ="";

        while (no != 0){
        int pick_last = no %10;

        n = n+ Integer.toString(pick_last);
        no=no/10;

        }

        System.out.println(n);

        sc.close();

    }
}



/*To reverse a number, you need to take the digits of the number and rearrange them in the opposite order.

Start by converting the number to a string, reverse that string, and then convert it back to an integer. This will give you the reversed version of the original number.
Example: If the number is 908701, take digits from last → 1, 0, 7, 8, 0, 9 → and make it 107809.*/
