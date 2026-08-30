class Solution {
    public int minimumDeletions(int[] nums) {

        int min = 0;
        int max = 0;

        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < nums[min]) {
                min = i;
            }

            if (nums[i] > nums[max]) {
                max = i;
            }
        }

        int left = Math.min(min, max);
        int right = Math.max(min, max);

        
        int deleteleft = right + 1;

      
        int deleteright = nums.length - left;

        int deleteboth = (left + 1) + (nums.length - right);

        return Math.min(
            deleteleft,
            Math.min(deleteright, deleteboth)
        );
    }
}