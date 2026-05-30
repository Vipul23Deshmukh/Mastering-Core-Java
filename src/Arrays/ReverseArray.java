package Arrays;

import java.util.Arrays;

public class ReverseArray {
    //two pointers approach

    public static void reverseArray(int [] arr ){
        int i=0;
        int j=arr.length-1;
        // Loop only until pointers meet in the middle, and decrement j


        for(i=0;i<arr.length/2; i++ ){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            j--;
        }

    }

    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
