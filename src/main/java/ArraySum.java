public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr){
        // Step 1: Initialize an accumulator variable
        int total = 0;

        // Step 2: Loop through every index of the array
        for (int i = 0; i < arr.length; i++) {
            // Step 3: Add the current element to our running total
            total += arr[i];
        }

        // Step 4: Return the final calculation
        return total;

       
    }
}
