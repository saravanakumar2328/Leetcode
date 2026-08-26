class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String min = "";
        int m = s.length() + 1; // Start higher than maximum possible length
        
        // Loop through every possible starting point
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;

            // Loop through every possible ending point
            for (int j = i; j < s.length(); j++) {
                // Count '1's using fast character checks instead of parseInt
                if (s.charAt(j) == '1') {
                    sum++;
                }

                // If we found exactly k '1's
                if (sum == k) {
                    int currentLength = j - i + 1;
                    String currentString = s.substring(i, j + 1);

                    // Update if it's shorter OR if it's the same length but alphabetically smaller
                    if (currentLength < m) {
                        m = currentLength;
                        min = currentString;
                    } else if (currentLength == m && currentString.compareTo(min) < 0) {
                        min = currentString;
                    }
                    
                    // Break early because adding more characters will only make it longer
                    break; 
                }
            }
        }
        return min;
    }
}
