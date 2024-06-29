public class Sqrtx {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 0, high = x, root = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long midSquared = (long) mid * mid; 

            if (midSquared == x) return mid;

            if (midSquared < x) {
                low = mid + 1;
                root = mid;
            } else {
                high = mid - 1;
            }
        }

        return root;
    }
}
