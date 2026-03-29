package Arrays;

public class SecodLargest {


    public static void main(String[] args) {
        int [] array ={1,5,6,9,4,3,0};
        findSecondHighest(array);
        System.out.println(findSecondHighest(array));
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest && i < highest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }



}
