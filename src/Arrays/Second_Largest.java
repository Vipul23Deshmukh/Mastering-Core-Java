package Arrays;

public class Second_Largest {
    static int secondLargest(int [] arr){

        int max1=0, max2=0;

        if(arr[0]> arr[1])
        {   max1=arr[0];
            max2=arr[1];
        }

        else
        {
            max2=arr[0];
            max1=arr[1];
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
    return max2;
    }

    public static void main(String [] args){
        int [] a= {10,5,20,8};
        System.out.println(secondLargest(a));
    }
}
