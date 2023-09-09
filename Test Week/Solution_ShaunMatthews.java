public class Solution {
    
    public static int[] twoSum(int[] nums, int target) {

            // Iterate through the array using two nested loops
            for (int i = 0; i < nums.length - 1; i++) {
                
                for (int j = i + 1; j < nums.length; j++) {

                    // Check if the current pair of numbers adds up to the target
                    if (nums[i] + nums[j] == target) {

                        // Return the indices of the two numbers
                        return new int[]{i, j};
                    }
                }
            }
    
            // If no solution is found, return an empty array or throw an exception
            throw new IllegalArgumentException("No two numbers add up to the target");
        }
    
}
