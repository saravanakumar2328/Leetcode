class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[] arr=new int[n];
        List<List<String>> l1=new ArrayList<>();
        solve(n,arr,l1,0);
        return l1;
    }
    void solve(int n,int[] arr,List<List<String>> l1,int row){
        if(row==n){
            setsolution(l1, arr,n);
            return;
        }
        for(int col=0;col<n;col++){
            if(solvesol(col,row,arr)){
                arr[row]=col;
                   solve(n,arr,l1,row+1);
            }
        }
     
    }
    boolean solvesol(int col,int row,int[] arr){
        for(int i=0;i<row;i++){
            if(arr[i]==col||Math.abs(arr[i]-col) ==Math.abs(i-row) ){
                return false;
            }
        }
        return true;
    }
    void setsolution(List<List<String>> l1,int[]arr,int n){
        List<String> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(arr[i]==j){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
            ll.add(sb.toString());
        }
        l1.add(ll);
    }
}