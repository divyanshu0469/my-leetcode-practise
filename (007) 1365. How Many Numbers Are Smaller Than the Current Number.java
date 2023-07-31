/* URL : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/ */
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            int value = 0;
            for (int j = 0 ; j<n; j++){
                if (nums[j]<nums[i] && j!=i){
                    value+=1;
                }
            }
            result[i]=value;
        }
        return result;
    }
}
