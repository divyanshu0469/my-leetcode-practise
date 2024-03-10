/* URL : https://leetcode.com/problems/counting-bits/description/ */
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int count;
        int temp;
        for (int i = 0; i < n+1; i++) {
            count = 0;
            temp = i;
            while (temp != 0) {
                count++;
                // temp -= temp & (-temp);
                temp &= temp-1;
            }
            arr[i] = count;
        }
        return arr;
    }
}
