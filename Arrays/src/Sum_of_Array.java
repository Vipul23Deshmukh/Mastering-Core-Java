public class Sum_of_Array {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] arr = {2, 4, 6, 8};

        // Initialize a variable to store the sum
        int sum = 0;

        // Loop through the array elements using a for-each loop
        for (int element : arr) {
            sum += element; // Add each element to the sum
        }

        // Print the total sum
        System.out.println("The sum of the array is: " + sum);
    }
}
