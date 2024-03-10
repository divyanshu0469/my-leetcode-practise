/* URL : https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/ */
class Solution {
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        int temp = 2;
        while (temp <= n/2) {
            if (n%temp == 0) {
                return false;
            }
            temp++;
        }
        return true;
    }

    public int bitCounter(int n) {
        int count = 0;
        while (n != 0) {
            n = n - (n & -n);
            count++;
        }
        return count;
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        while (left <= right) {
            if (isPrime(bitCounter(left))) {
                ans++;
            }
            left++;
        }
        return ans;
    }
}
