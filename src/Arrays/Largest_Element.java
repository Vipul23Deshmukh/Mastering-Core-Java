package Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int [] arr={5,9,11,7};
        Find_Largest(arr);
    }


    public static void Find_Largest(int [] arr){
        int largest=arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }


        }
        System.out.println(largest);
    }


}
