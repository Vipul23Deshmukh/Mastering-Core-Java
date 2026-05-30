package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Duplicates {
    public static int findDuplicates(int [] nums){
        int len=nums.length;

        Set<Integer> set= new HashSet<>();
        for(int i=0; i<len;i++){

            if(!set.add(nums[i])){

                return nums[i];
            }


        }

   return  len;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,2,4,1};
        findDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
