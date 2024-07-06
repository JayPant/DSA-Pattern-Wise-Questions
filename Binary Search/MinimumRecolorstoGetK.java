public class MinimumRecolorstoGetK {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minRecolors = Integer.MAX_VALUE;
        
        // Count the number of 'W's in the first window of size k
        int currentWhites = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentWhites++;
            }
        }
        
        // Initialize the minimum recolors with the initial count
        minRecolors = currentWhites;
        
        // Slide the window from the beginning to the end of the string
        for (int i = k; i < n; i++) {
            // Remove the leftmost element of the previous window
            if (blocks.charAt(i - k) == 'W') {
                currentWhites--;
            }
            // Add the new element of the current window
            if (blocks.charAt(i) == 'W') {
                currentWhites++;
            }
            // Update the minimum recolors
            minRecolors = Math.min(minRecolors, currentWhites);
        }
        
        return minRecolors;
    }
}