package Basics;

public class Armstrong_number {

    public static void main (String[]args)
    {
        int num = 407, len;

        // function to get order(length)
        len = order (num);

        // check if Armstrong
        if (armstrong (num, len))
            System.out.println(num + " is armstrong");
        else
            System.out.println(num + " is armstrong");

    }


    static int order (int x)
    {
        int len = 0;
        while (x != 0 )
        {
            len++;
            x = x / 10;
        }
        return len;
    }

    static boolean armstrong (int num, int len)
    {

        int sum = 0, temp, digit;
        temp = num;

        // loop to extract digit, find power & add to sum
        while (temp != 0)
        {
            // extract digit
            digit = temp % 10;

            // add power to sum
            sum = sum + (int)Math.pow(digit, len);
            temp /= 10;
        };

        return num == sum;
    }
}

/*20. Write the code to for Armstrong number
An Armstrong number (or Narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

For example:
153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
370 is an Armstrong number because 3^3 + 7^3 + 0^3 = 370.*/