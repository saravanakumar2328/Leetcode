class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=1;
        int left=0;
        if(s.length()==1){
            return 1;
        }
        int k=0;

        while(right<s.length()){
            String ch=s.substring(right,right+1);

            while(s.substring(left,right).contains(ch)){
                left++;


            }
            k=Math.max(k,right-left+1);
            right++;

        }
        return k;
        
    }
}