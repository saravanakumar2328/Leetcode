class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int bal = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 && j >= 0) {

            int ii = a.charAt(i) - '0';
            int jj = b.charAt(j) - '0';

            int k = ii + jj + bal;

            sb.append(k % 2);
            bal = k / 2;

            i--;
            j--;
        }

        while (i >= 0) {

            int ii = a.charAt(i) - '0';

            int k = ii + bal;

            sb.append(k % 2);
            bal = k / 2;

            i--;
        }

        while (j >= 0) {

            int jj = b.charAt(j) - '0';

            int k = jj + bal;

            sb.append(k % 2);
            bal = k / 2;

            j--;
        }

        if (bal > 0) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}