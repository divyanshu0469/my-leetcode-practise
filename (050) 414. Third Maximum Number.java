/* URL : https://leetcode.com/problems/third-maximum-number/ */
class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null, max2 = null, max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || max1 < n) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || max2 < n) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || max3 < n) {
                max3 = n;
            }
        }


        return max3 == null ? max1 : max3;
    }
}
