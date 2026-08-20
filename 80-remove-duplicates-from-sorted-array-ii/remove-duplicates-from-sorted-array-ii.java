class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // n tracking the last valid index dynamically
        int n = nums.length - 1; 
        
        for (int i = 0; i <= n; i++) {
            int l = 1;
            for (int j = i + 1; j <= n; ) { 
                
               
                if (nums[i] == nums[j] && l < 2) {
                    l++;
                    j++; 
                }
              
                else if (nums[i] == nums[j]) {
                   
                    for (int h = j; h < n; h++) { 
                        nums[h] = nums[h + 1]; 
                    }
                    n--; 
                   
                }
                
                else if (nums[i] < nums[j]) {
                    break;
                }
            }
        }
       
        return n + 1; 
    }
}
