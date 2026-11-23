class Solution {
    int count=0;
    public int totalNQueens(int n) {
        solve(n,0,new boolean[n],new boolean[2*n-1],new boolean[2*n-1]);
        return count;

        
    }
    void solve(int n,int row,boolean col[],boolean rightdig[],boolean leftdig[]){
        if(row==n){
            count++;
            return;
        }

        for(int coll=0;coll<n;coll++){
            int left=row-coll+n-1;
            int right=row+coll;
            if(!col[coll] && !rightdig[right] && !leftdig[left]){
                col[coll]=true;
                rightdig[right]=true;
                leftdig[left]=true;
                solve(n,row+1,col,rightdig,leftdig);
                col[coll]=false;
                rightdig[right]=false;
                leftdig[left]=false;
            }
        }
    }

}