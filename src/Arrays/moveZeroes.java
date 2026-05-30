package Arrays;

public class moveZeroes {
    public static void manin(String [] args) {

        moveZeroes obj=new moveZeroes();

        int []nums={0,1,0,3,12};
        obj.moveZero(nums);

    }

    public  void moveZero(int [] nums){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){

                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }

        }
    }

}


/*
* 283. Move Zeroes
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/


//==========================================================================================================
/*

Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 0

Example 2:

Input:

6 — Value of N.

[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

Output:

6 1 8 2 0 0
*/
