class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
       int[] nums = new int[n1 + n2];
        int l=0;
        int r=0;
        int g=0;
        double d=0;
        while(l<n1 && r<n2)
        {
            if(nums1[l]<nums2[r]){
                nums[g++]=nums1[l++];

            }
            else{
                 nums[g++]=nums2[r++];
            }
        }
        while(l<n1 )
        {
        nums[g++]=nums1[l++];

        }
         while(r<n2 )
        {
        nums[g++]=nums2[r++];

        }
         int w=nums.length/2;
        if(nums.length%2==0){
           
           d =(nums[w]+nums[w-1])/2.0;
            
        }
        else{
              d=nums[w];
           

        }
        return d;

    }
}