package Basics;

public class Perfect_number {
    public static void main(String[] args) {

        int a=28;
         int sum=0;

         for(int i =1; i<a ;i++){
             if(a%i==0){
                 sum = sum + i;
             }
         }

         if(sum ==a)
             System.out.println(a+" Is a perfect number");
         else
             System.out.println(a+" Is not a perfect number");
    }
}
