class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int left = 0, countOnes = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
           
            if (s.charAt(right) == '1') {
                countOnes++;
            }

            while (countOnes == k) {
                String currentSubstring = s.substring(left, right + 1);
                
               
                if (ans.isEmpty() || currentSubstring.length() < ans.length()) {
                    ans = currentSubstring;
                } else if (currentSubstring.length() == ans.length() && currentSubstring.compareTo(ans) < 0) {
                    ans = currentSubstring;
                }

                if (s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        return ans;}
}