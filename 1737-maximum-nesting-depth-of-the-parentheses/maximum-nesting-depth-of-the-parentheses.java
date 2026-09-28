class Solution {
    public int maxDepth(String s) {
        char[] arr=new char[s.length()];
        int top=-1;
        int max=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            
            if(c=='('){
                arr[++top]=c;
                count++;
                max=Math.max(count,max);

            }
            else if(c==')'){
                --top;
                count--;
            }
            else{

            }

        }
        return max;

        
    }
}