import java.util.ArrayList;

public class AllocateBook {
        private static int countStudent(ArrayList<Integer> arr, int pages) {
        int student = 1;
        int pageCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (pageCount + arr.get(i) <= pages) {
                pageCount += arr.get(i);
            } else {
                student++;
                pageCount = arr.get(i);
            }
        }
        return student;
    }
    
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (arr.size() < m) {
            return -1; // More students than books
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num : arr) {
            sum += num;
            max = Math.max(max, num);
        }
        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int countStd = countStudent(arr, mid);

            if (countStd > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
