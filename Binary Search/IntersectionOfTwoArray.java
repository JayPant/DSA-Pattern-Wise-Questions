import java.util.HashSet;

public class IntersectionOfTwoArray {
     public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements from nums2 to set2 if they are in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        // Convert set2 to an array
        int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }
        
        return result;
    }
}
