/* URL : https://leetcode.com/problems/median-of-two-sorted-arrays/ */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if((m+n) == 0){
            return 0.00000;
        }
        if(m == 1 && n == 0){
            return (double)nums1[0];
        }
        if(m == 0 && n == 1){
            return (double)nums2[0];
        }
        int[] arr = new int[m + n];
        System.arraycopy(nums1, 0, arr, 0, m);
        System.arraycopy(nums2, 0, arr, m, n);
        Arrays.sort(arr);
        double ans;
        if((m+n)%2 != 0){
            ans = (double) arr[arr.length/2];
            return ans;
        }
        else{
            ans =  ((double)(arr[arr.length/2 - 1] + arr[arr.length/2]) / 2);
            return ans;
        }
    }
}
