class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int wi=right-left;
           
            if(height[right]>height[left]){
                 max=Math.max(max,height[left]*wi);
                left++;
            }
            else{
                  max=Math.max(max,height[right]*wi);
                right--;
            }
        }
        return max;
        
    }
}