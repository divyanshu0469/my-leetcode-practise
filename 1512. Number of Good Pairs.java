/* UR: : https://leetcode.com/problems/number-of-good-pairs/ */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(i<j && nums[i]==nums[j]){
                    result = result + 1;
                    
                }
            }
        }
        return result;
    }
}
