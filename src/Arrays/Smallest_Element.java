package Arrays;

public class Smallest_Element {

    public static void main(String[] args) {

        int [] arr={1,10,4,60,3,2};

        System.out.println(SmallestElement(arr));

    }


    public static int SmallestElement(int [] arr){
        int min =arr[0];

         for (int i=0;i<arr.length;i++){

             if(min > arr[i]){
                 min= arr[i];
             }
         }
         return min;

    }
}
