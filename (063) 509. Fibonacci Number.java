/* URL : https://leetcode.com/problems/fibonacci-number/description/ */
class Solution {
    public int fib(int n) {
        long b = (long) Math.sqrt(5);
        long a = (long) Math.pow(((1 + b) / 2), n);
        return (int) a / (int)b;
    }
}
