package Arrays;





/*
Highest Occurring Element in an Array
Subscribe to TUF+

Hints
        Company
Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.



Please note that this section might seem a bit difficult without prior knowledge on what hashing is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!


Example 1

Input: nums = [1, 2, 2, 3, 3, 3]

Output: 3

Explanation: The number 3 appears the most (3 times). It is the most frequent element.

Example 2

Input: nums = [4, 4, 5, 5, 6]

Output: 4

Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.*/

import java.util.HashMap;

public class Highest_Occurring_Element {
    public static void main(String[] args) {
Highest_Occurring_Element obj=new Highest_Occurring_Element();
int [] nums1={1, 2, 2, 3, 3, 3};
        System.out.println(obj.mostFrequentElement(nums1));

        int [] nums2={4, 4, 5, 5, 6};
        System.out.println(obj.mostFrequentElement(nums2));

    }

    public  int mostFrequentElement(int [] nums){
        HashMap<Integer, Integer> freqmap=new HashMap<>();
        for(int num : nums){
            freqmap.put(num,freqmap.getOrDefault(num ,0 )+1);
        }
        int maxFreq=0;
        int result= Integer.MAX_VALUE;
        for(int key : freqmap.keySet()){
            int freq=freqmap.get(key);
            if (freq > maxFreq || (freq==maxFreq && key <result)) {
maxFreq=freq;
result=key;
            }
        }
        return result;
    }
}
