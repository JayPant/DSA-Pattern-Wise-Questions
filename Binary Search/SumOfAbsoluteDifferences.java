public class SumOfAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        
        // Compute prefix sums
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        
        // Compute suffix sums
        suffixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }
        
        // Calculate the result for each element
        for (int i = 0; i < n; i++) {
            int leftSum = (i > 0) ? prefixSum[i - 1] : 0;
            int rightSum = (i < n - 1) ? suffixSum[i + 1] : 0;
            
            int leftCount = i;
            int rightCount = n - i - 1;
            
            int leftDiff = nums[i] * leftCount - leftSum;
            int rightDiff = rightSum - nums[i] * rightCount;
            
            result[i] = leftDiff + rightDiff;
        }
        
        return result;
    }
}
