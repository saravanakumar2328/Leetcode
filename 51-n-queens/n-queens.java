class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[] arr = new int[n];
        List<List<String>> l1 = new ArrayList<>();
        
        // O(1) lookup arrays for columns and both diagonals
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1]; // row - col + (n - 1)
        boolean[] diag2 = new boolean[2 * n - 1]; // row + col
        
        solve(n, arr, l1, 0, cols, diag1, diag2);
        return l1;
    }

    void solve(int n, int[] arr, List<List<String>> l1, int row, 
               boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            setsolution(l1, arr, n);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;
            
            // O(1) validity check
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }
            
            // Place queen & mark paths as occupied
            arr[row] = col;
            cols[col] = diag1[d1] = diag2[d2] = true;
            
            solve(n, arr, l1, row + 1, cols, diag1, diag2);
            
            // Backtrack: unmark paths for the next iteration
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    void setsolution(List<List<String>> l1, int[] arr, int n) {
        List<String> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] rowChars = new char[n];
            Arrays.fill(rowChars, '.');
            rowChars[arr[i]] = 'Q';
            ll.add(new String(rowChars));
        }
        l1.add(ll);
    }
}
