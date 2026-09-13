class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> has=new HashMap();

        for(int i=0;i<numbers.length;i++){
            int tar=target-numbers[i];
            if(has.containsKey(tar)){
                int [] numbe={has.get(tar)+1,i+1};
                return numbe;
            }
            has.put(numbers[i],i);
        }
         int [] numbe={-1,-1};
        return numbe;
      
        
    }
}