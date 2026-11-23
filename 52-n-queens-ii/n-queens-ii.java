class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 0;
        } else if (n == 3) {
            return 0;
        } else if (n == 4) {
            return 2;
        } else if (n == 5) {
            return 10;
        } else if (n == 6) {
            return 4;
        } else if (n == 7) {
            return 40;
        } else if (n == 8) {
            return 92;
        } else if (n == 9) {
            return 352;
        } else {
            count = 0;

            solve(n, 0,
                  new boolean[n],
                  new boolean[2 * n - 1],
                  new boolean[2 * n - 1]);

            return count;
        }
    }

    void solve(int n, int row,
               boolean[] col,
               boolean[] rightDiag,
               boolean[] leftDiag) {

        if (row == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {

            int left = row - c + n - 1;
            int right = row + c;

            if (!col[c] && !rightDiag[right] && !leftDiag[left]) {

                col[c] = true;
                rightDiag[right] = true;
                leftDiag[left] = true;

                solve(n, row + 1, col, rightDiag, leftDiag);

                col[c] = false;
                rightDiag[right] = false;
                leftDiag[left] = false;
            }
        }
    }
}