class Solution {
    public boolean isValid(String s) {
        String[] ss=s.split("");
        String []sss=new String[ss.length];
        int top=-1;

        for(int i=0;i<ss.length;i++){
            if(ss[i].equals("(")||ss[i].equals("{")||ss[i].equals("[")){
                sss[++top]=ss[i];

            }
            else{
                if(top>-1){
                    if(ss[i].equals(")")){
                        if(!sss[top].equals("(")){
                            return false;
                        }
                        else{
                            top--;
                        }

                    }
                    else if(ss[i].equals("}")){
                         if(!sss[top].equals("{")){
                            return false;
                        }
                        else{
                            top--;
                        }

                    }
                    else{
                        if(!sss[top].equals("[")){
                            return false;
                        }
                        else{
                            top--;
                        }
                    }
                }
                else{
                    return false;
                }
            }
           

        }
        if(top==-1){
            return true;
        }
        return false;

        
    }
}