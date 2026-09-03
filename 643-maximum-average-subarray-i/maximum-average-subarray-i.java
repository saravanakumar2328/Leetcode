class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        
        
        for(int i=0;i<k;i++){
            sum=sum+nums[i];

        }
        double avg=sum/k;

        for(int i=0;i<nums.length-k;i++){
            sum=sum+nums[i+k]-nums[i];
            double aavg=sum/k;
            avg=Math.max(avg,aavg);

        }
        return avg;
    }
}