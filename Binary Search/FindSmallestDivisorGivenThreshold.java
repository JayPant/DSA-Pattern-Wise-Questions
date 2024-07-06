public class FindSmallestDivisorGivenThreshold {
    private boolean isDivisor(int[] arr, int num, int threshold) {
        int divSum = 0;
        for (int i : arr) {
            divSum += (i + num - 1) / num; 
        }
        return divSum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxNum(nums);
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isDivisor(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int maxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) max = i;
        }
        return max;
    }
}
