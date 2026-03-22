package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        RemoveDuplicate(arr);
    }
    public static void RemoveDuplicate(int [] arr ){
        Set<Integer> set= new HashSet<>();
        //A HashSet is created. Think of a HashSet like a bucket where you throw items in.
        // If you try to throw in something that is already in the bucket, it simply ignores the second one.

        for(int i :arr ){

            set.add(i);

//            The code loops through every number in your array:
//
//            Step 1: It sees 1. The set is empty, so it adds 1.
//
//            Step 2: It sees 2. The set doesn't have 2, so it adds 2.
//
//            Step 3: It sees 2 again. The set says, "I already have a 2," and does nothing.
//
//                    Step 4: It sees 3. The set doesn't have 3, so it adds 3.
        }
        System.out.println(set);
    }
}
