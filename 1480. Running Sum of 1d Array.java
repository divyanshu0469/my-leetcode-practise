/* URL - https://leetcode.com/problems/running-sum-of-1d-array/ */

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        int i=0;
        while(i<n){
            int a = 0;
            int s=0;
            while(a<=i){
                s=s+nums[a];
                a++;
            }
            sum[i]=s;
            i++;
        }
        return sum;
        
    }
}
