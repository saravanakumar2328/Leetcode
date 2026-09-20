class Solution {
    public int reverseDegree(String s) {

        int k=0;
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);

            int value = 26 - (cc - 'a');

            k += (i + 1) * value;
        } return k;
        
    }
}