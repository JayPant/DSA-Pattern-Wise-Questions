import java.util.*;
public class MaximumSumOFDistinctKElement {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        
        while (i < nums.length) {
            // Filling the HashSet with unique elements until we have size k or reach end
            while (j < nums.length && set.size() < k && !set.contains(nums[j])) {
                set.add(nums[j]);
                currSum += nums[j];
                j++;
            }
            
            // Checking if we have a valid k-sized window
            if (set.size() == k) {
                maxSum = Math.max(currSum, maxSum);
            }
            
            // Move the window forward by removing nums[i] from the current window
            currSum -= nums[i];
            set.remove(nums[i]);
            i++;
        }
        
        return maxSum;
    }
}
