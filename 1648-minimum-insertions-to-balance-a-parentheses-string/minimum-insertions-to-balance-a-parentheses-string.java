class Solution {
    public int minInsertions(String s) {
        int o=0;
        int p=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            o++;
        }
        else{
            if((i+1)<s.length() && s.charAt(i+1)==')'){
                i++;

            }
            else{p++;

            }
            if(o>0){
                o--;
            }
            else{
                p++;
            }

        }
    }
   

    return (o * 2) + p; 
        
    }
}