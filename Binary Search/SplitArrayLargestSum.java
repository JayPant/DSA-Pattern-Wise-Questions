public class SplitArrayLargestSum {
    static int countPartition(int[] nums, int maxSum) {
        int countPart = 1;
        int elementSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (elementSum + nums[i] > maxSum) {
                countPart++;
                elementSum = nums[i];
            } else {
                elementSum += nums[i];
            }
        }
        return countPart;
    }

    public int splitArray(int[] nums, int m) {
        if(m>nums.length) return -1; 
        
        int sum=0, max = Integer.MIN_VALUE;
         for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        int low =max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int partition = countPartition(nums, mid);

            if (partition > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
