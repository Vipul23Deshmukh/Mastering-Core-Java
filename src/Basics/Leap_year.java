package Basics;

import java.util.Scanner;

//check whether a given year is leap year or not.
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether a given year is leap year or not");
        int year=sc.nextInt();

        if( year % 400 ==0)
            System.out.println(year+ "Is the leap year");

        else if (year % 4==0 && year % 100 !=0){
            System.out.println(year + "IS the leap year");

        }
        else
            System.out.println(year + " Is not a leap year");



    }
}
