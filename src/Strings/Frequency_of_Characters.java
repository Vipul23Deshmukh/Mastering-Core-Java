package Strings;

import java.util.Scanner;

public class Frequency_of_Characters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        int i, j;

        //Converts given string into character array
        char string[] = str.toCharArray();
        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }
        //Displays the each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }

}
/*7. Write code to Calculate frequency of characters in a string
This problem asks to calculate the frequency of each character in a given string.

The goal is to determine how many times each character appears in the string.
Example for string “hello”:
‘h’ appears 1 time
‘e’ appears 1 time
‘l’ appears 2 times
‘o’ appears 1 time*/